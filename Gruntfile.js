module.exports = function(grunt) {

    grunt.initConfig({

        bower: {
            install: {
                options: {
                    targetDir: 'src/main/resources/js/vendor',
                    layout: 'byComponent'
                }
            }
        }
    });

    // Load NPM tasks
    grunt.loadNpmTasks('grunt-bower-task');

    // Default Task
    grunt.registerTask('default', ['bower']);
};