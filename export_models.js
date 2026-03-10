// Run this script in Blockbench's console (Help -> Developer -> Console)
// It will export all Deep Blue models to the mod folder

const exportPath = '/Users/egekaanduman/Desktop/minecraftplayground/minecraft-ai-playground/mods/deep-blue/src/main/resources/assets/deepblue';

// Map of project names to file names
const deepBlueModels = {
    'Giant Squid': 'giant_squid',
    'Whale Sh': 'whale_shark',
    'Swordfish': 'swordfish',
    'Blue Whale': 'blue_whale',
    'Humpback': 'humpback_whale',
    'Orca': 'orca',
    'Great White': 'great_white_shark',
    'Hammerhead': 'hammerhead_shark',
    'Narwhal': 'narwhal',
    'Mola': 'mola_mola'
};

async function exportAllModels() {
    const projects = ModelProject.all;
    console.log(`Found ${projects.length} projects`);
    
    for (const project of projects) {
        // Find matching model name
        let fileName = null;
        for (const [searchName, file] of Object.entries(deepBlueModels)) {
            if (project.name && project.name.toLowerCase().includes(searchName.toLowerCase())) {
                fileName = file;
                break;
            }
        }
        
        if (!fileName) {
            console.log(`Skipping: ${project.name} (not a Deep Blue model)`);
            continue;
        }
        
        console.log(`Exporting: ${project.name} as ${fileName}`);
        
        // Select the project
        project.select();
        
        // Wait a bit for selection
        await new Promise(r => setTimeout(r, 100));
        
        try {
            // Export geometry
            const geoPath = `${exportPath}/geo/${fileName}.geo.json`;
            Blockbench.export({
                type: 'Bedrock Model',
                extensions: ['geo.json'],
                savetype: 'json',
                content: Codecs.bedrock.compile(),
                name: fileName,
                startpath: geoPath
            }, (path) => console.log(`  Geo saved to: ${path}`));
            
            // Export animation if exists
            if (Animation.all.length > 0) {
                const animPath = `${exportPath}/animations/${fileName}.animation.json`;
                Blockbench.export({
                    type: 'Bedrock Animation',
                    extensions: ['animation.json'],
                    savetype: 'json', 
                    content: Codecs.bedrock_animation.compile(),
                    name: fileName,
                    startpath: animPath
                }, (path) => console.log(`  Animation saved to: ${path}`));
            }
            
            // Export texture
            if (Texture.all.length > 0) {
                const texPath = `${exportPath}/textures/entity/${fileName}.png`;
                Texture.all[0].save(texPath);
                console.log(`  Texture saved to: ${texPath}`);
            }
            
        } catch (e) {
            console.error(`  Error exporting ${fileName}:`, e);
        }
    }
    
    console.log('Export complete!');
}

exportAllModels();
