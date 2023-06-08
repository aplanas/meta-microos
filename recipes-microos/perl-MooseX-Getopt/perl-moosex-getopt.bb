SUMMARY = "Moose role for processing command line options"
DESCRIPTION = "This is a role which provides an alternate constructor for creating objects \
using parameters passed in from the command line."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.75"

RPM_NAME = "perl-MooseX-Getopt-0.75-1.10.noarch.rpm"
RPM_HASH = "81f11e0d5291f7c270a0eef2829892533950e91a9a6fa54f52871eadc1fcfee77be126fa6017889663c4a30f109e918b62381dd9c1fe4be8ea325771360ca9cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Getopt) perl(MooseX::Getopt::Basic) perl(MooseX::Getopt::Dashes) perl(MooseX::Getopt::GLD) perl(MooseX::Getopt::Meta::Attribute) perl(MooseX::Getopt::Meta::Attribute::NoGetopt) perl(MooseX::Getopt::Meta::Attribute::Trait) perl(MooseX::Getopt::Meta::Attribute::Trait::NoGetopt) perl(MooseX::Getopt::OptionTypeMap) perl(MooseX::Getopt::ProcessedArgv) perl(MooseX::Getopt::Strict) perl-MooseX-Getopt"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Getopt::Long) perl(Getopt::Long::Descriptive) perl(Moose) perl(Moose::Meta::Attribute) perl(Moose::Role) perl(Moose::Util::TypeConstraints) perl(MooseX::Role::Parameterized) perl(Try::Tiny) perl(namespace::autoclean)"

inherit rpm
