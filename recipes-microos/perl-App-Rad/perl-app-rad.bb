SUMMARY = "Framework to facilitate creation of command line applications"
DESCRIPTION = "App::Rad is a framework for developing \
command-line applications. It can transform Perl _one-liners_ \
into subroutines than can be called by the user of your \
program. \
 \
It also provides an interface for common command-line \
tasks."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.05"

RPM_NAME = "perl-App-Rad-1.05-1.23.noarch.rpm"
RPM_HASH = "35b32e123e4db49d8c527a248faac3b5491dbebf0e91fc39af3ad2b9769e7caa47cc0004397c107ff8f2fc1971598494ee8a24c8b7d99d34b3748140148bef46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(App::Rad) perl(App::Rad::Config) perl(App::Rad::Exclude) perl(App::Rad::Help) perl(App::Rad::Include) perl-App-Rad"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Getopt::Long)"

inherit rpm
