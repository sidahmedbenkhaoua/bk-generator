'use strict';
var chalk = require('chalk');
var yosay = require('yosay');
var yeoman = require('yeoman-generator');

module.exports = yeoman.generators.Base.extend({
  prompting: function () {
    var done = this.async();

    this.log(yosay(
      'Welcome to the awesome ' + chalk.red('bk-generator') + ' ' + chalk.blue('service') + ' generator, powered by the awsome ' + chalk.bgMagenta('ALGERIA!')
    ));

    var prompts = [{
        type    : 'input',
        name    : 'name',
        message : 'Your project name',
        default : this.appname // Default to current folder name
    },
        {
            type    : 'input',
            name    : 'package',
            message : 'Your package name',
            default : 'dz.bkgenerator' // Default to current folder name
        }];

    this.prompt(prompts, function (props) {
      this.props = props;



      done();
    }.bind(this));
  },
  writing: function () {
    this.fs.copy(
      this.templatePath(''),
      this.destinationPath('')
    );
  }
});
