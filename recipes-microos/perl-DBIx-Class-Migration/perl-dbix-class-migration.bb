SUMMARY = "Use the best tools together for sane database migrations"
DESCRIPTION = "DBIx::Class::DeploymentHandler is a state of the art solution to the \
problem of creating sane workflows for versioning DBIx::Class managed \
database projects. However, since it is more of a toolkit for building \
custom versioning and migration workflows than an expression of a \
particular migration practice, it might not always be the most approachable \
tool. If you are starting a new DBIx::Class project and you don't have a \
particular custom workflow need, you might prefer to simply be given a \
reasonable clear and standard practice, rather than a toolkit with a set of \
example scripts. \
 \
DBIx::Class::Migration defines some logic which combines both \
DBIx::Class::DeploymentHandler and DBIx::Class::Fixtures, along with a \
standard tutorial, to give you a simple and straightforward approach to \
solving the problem of how to best create database versions, migrations and \
testing data. Additionally it builds on tools like Test::mysqld and \
Test::Postgresql58 along with DBD::Sqlite in order to assist you in quickly \
creating a local development database sandbox. It offers some integration \
points to testing your database, via tools like Test::DBIx::Class in order \
to make testing your database driven logic less painful. Lastly, we offer \
some thoughts on good development patterns in using databases with \
application frameworks like Catalyst. \
 \
DBIx::Class::Migration offers code and advice based on my experience of \
using DBIx::Class for several years, which hopefully can help you bootstrap \
a new project. The solutions given should work for you if you want to use \
DBIx::Class and have database migrations, but don't really know what to do \
next. These solutions should scale upward from a small project to a medium \
project involving many developers and more than one target environment (DEV \
-> QA -> Production.) If you have very complex database versioning \
requirements, huge teams and difficult architectual issues, you might be \
better off building something on top of DBIx::Class::DeploymentHandler \
directly. \
 \
DBIx::Class::Migration is a base class upon which interfaces like \
DBIx::Class::Migration::Script are built. \
 \
Please see DBIx::Class::Migration::Tutorial for more approachable \
documentation. If you want to read a high level feature overview, see \
DBIx::Class::Migration::Features. The remainder of this POD is API level \
documentation on the various internals."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.075"

RPM_NAME = "perl-DBIx-Class-Migration-0.075-1.12.noarch.rpm"
RPM_HASH = "0f34e4c3ad5b391fbabccc356fac506a566ec23eaf334cad4caa37ce9e07a0f9b4c58a443dc0038684b066fcc96bb93863e88ceeaadd648823ad67d991f4c273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Catalyst::TraitFor::Model::DBIC::Schema::FromMigration) perl(Catalyst::TraitFor::Model::DBIC::Schema::FromMigration::_MigrationHelper) perl(DBIx::Class::Migration) perl(DBIx::Class::Migration::MySQLSandbox) perl(DBIx::Class::Migration::Population) perl(DBIx::Class::Migration::PostgresqlSandbox) perl(DBIx::Class::Migration::RunScript) perl(DBIx::Class::Migration::RunScript::Trait::Dump) perl(DBIx::Class::Migration::RunScript::Trait::Populate) perl(DBIx::Class::Migration::RunScript::Trait::SchemaLoader) perl(DBIx::Class::Migration::RunScript::Trait::TargetPath) perl(DBIx::Class::Migration::Sandbox) perl(DBIx::Class::Migration::SandboxDirSandboxBuilder) perl(DBIx::Class::Migration::SchemaLoader) perl(DBIx::Class::Migration::Script) perl(DBIx::Class::Migration::ShareDirBuilder) perl(DBIx::Class::Migration::SqliteSandbox) perl(DBIx::Class::Migration::TargetDirSandboxBuilder) perl(DBIx::Class::Migration::TempDirBuilder) perl(DBIx::Class::Migration::TempDirSandboxBuilder) perl(DBIx::Class::Migration::Types) perl(Test::DBIx::Class::FixtureCommand::Population) perl-DBIx-Class-Migration"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0) perl(Class::Load) perl(Config::MySQL) perl(DBD::SQLite) perl(DBIx::Class::DeploymentHandler) perl(DBIx::Class::Fixtures) perl(DBIx::Class::Schema::Loader) perl(Devel::PartialDump) perl(File::ShareDir::ProjectDistDir) perl(JSON::MaybeXS) perl(Log::Any) perl(Module::Find) perl(Moo) perl(MooX::Attribute::ENV) perl(MooX::Options) perl(MooX::Traits) perl(Pod::Parser) perl(SQL::Translator) perl(Text::Brew) perl(Type::Tiny) perl(version)"

inherit rpm
