/**
 * Created by benkraoua.sidahmed on 05/03/2017.
 */
'user strict'
var generators = require('yeoman-generator');
module.exports = generators.NamedBase.extend({
  constructor: function () {
    generators.NamedBase.apply(this, arguments)

  },
  writing: function () {
    this.fs.copyTpl(
      this.templatePath('_entity.java'),
      this.destinationPath('entity/' + this.name + '.java'),
      {
        entity: this.name,
        app: this.appname,
        entityName: this.name.toLowerCase()
      }
    );
  }
})
