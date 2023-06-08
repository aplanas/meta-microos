SUMMARY = "Extensible authentication framework for Dancer2 apps"
DESCRIPTION = "A user authentication and authorisation framework plugin for Dancer2 apps. \
 \
Makes it easy to require a user to be logged in to access certain routes, \
provides role-based access control, and supports various authentication \
methods/sources (config file, database, Unix system users, etc). \
 \
Designed to support multiple authentication realms and to be as extensible \
as possible, and to make secure password handling easy. The base class for \
auth providers makes handling 'RFC2307'-style hashed passwords really \
simple, so you have no excuse for storing plain-text passwords. A simple \
script called *dancer2-generate-crypted-password* to generate RFC2307-style \
hashed passwords is included, or you can use Crypt::SaltedHash yourself to \
do so, or use the 'slappasswd' utility if you have it installed."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.710"

RPM_NAME = "perl-Dancer2-Plugin-Auth-Extensible-0.710-1.9.noarch.rpm"
RPM_HASH = "15c502c53fec61e489f17bc5dede22876d0ef2c1e4fadc202eb4f81140b91c2cfddb76cb491dd61617182e7b880ee518e598c78f9f1c085cf12910dc49b08caa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Dancer2::Plugin::Auth::Extensible) perl(Dancer2::Plugin::Auth::Extensible::Provider::Config) perl(Dancer2::Plugin::Auth::Extensible::Provider::Example) perl(Dancer2::Plugin::Auth::Extensible::Provider::Unix) perl(Dancer2::Plugin::Auth::Extensible::Role::Provider) perl(Dancer2::Plugin::Auth::Extensible::Test) perl(Dancer2::Plugin::Auth::Extensible::Test::App) perl-Dancer2-Plugin-Auth-Extensible"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0) perl(Crypt::SaltedHash) perl(Dancer2) perl(Dancer2::Core::Types) perl(Dancer2::FileUtils) perl(Dancer2::Plugin) perl(Dancer2::Template::Tiny) perl(File::Share) perl(HTTP::BrowserDetect) perl(Module::Runtime) perl(Moo) perl(Moo::Role) perl(Plack) perl(Session::Token) perl(Try::Tiny) perl(URI::Escape) perl(YAML) perl(namespace::clean)"

inherit rpm
