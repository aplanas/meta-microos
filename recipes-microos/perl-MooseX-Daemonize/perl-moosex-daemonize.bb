SUMMARY = "Role for daemonizing your Moose based application"
DESCRIPTION = "Often you want to write a persistent daemon that has a pid file, and \
responds appropriately to Signals. This module provides a set of basic \
roles as an infrastructure to do that."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.22"

RPM_NAME = "perl-MooseX-Daemonize-0.22-1.14.noarch.rpm"
RPM_HASH = "97ccc2ee4768f6ac3fa66552c284c956860db33cbc22e22e74f23fe17c4b38424d1b54790fcefe0203ecdeeac43b27c0c4631bfea785e20c7104d575813d56fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Daemonize) perl(MooseX::Daemonize::Core) perl(MooseX::Daemonize::Pid) perl(MooseX::Daemonize::Pid::File) perl(MooseX::Daemonize::WithPidFile) perl(Test::MooseX::Daemonize) perl-MooseX-Daemonize"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(File::Path) perl(Moose) perl(Moose::Role) perl(Moose::Util::TypeConstraints) perl(MooseX::Getopt) perl(MooseX::Getopt::OptionTypeMap) perl(MooseX::Types::Path::Class) perl(Sub::Exporter) perl(namespace::autoclean)"

inherit rpm
