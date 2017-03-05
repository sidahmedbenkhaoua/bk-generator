'use strict';
var chalk = require('chalk');
var yosay = require('yosay');
var yeoman = require('yeoman-generator');

module.exports = yeoman.generators.Base.extend({
  prompting: function () {
    var done = this.async();

    this.log(yosay(
      'Welcome to the awesome ' + chalk.red('moltin') + ' ' + chalk.blue('service') + ' generator, powered by the awsome ' + chalk.bgMagenta('Israel!')
    ));

    var prompts = [{
      type: 'confirm',
      name: 'awesome',
      message: 'Don\'t you think Israel it\'s awsome?',
      default: true
    }];

    this.prompt(prompts, function (props) {
      this.props = props;

      if(this.props.awesome === false) {
        this.log(yosay(
          chalk.red('You know nothing, ') + chalk.green('padawan!')
        ));
       
      }

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
