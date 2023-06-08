SUMMARY = "Patch perl source a la Devel::PPPort's buildperl.pl"
DESCRIPTION = "Devel::PatchPerl is a modularisation of the patching code contained in \
Devel::PPPort's 'buildperl.pl'. \
 \
It does not build perls, it merely provides an interface to the source \
patching functionality."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.08"

RPM_NAME = "perl-Devel-PatchPerl-2.08-1.10.aarch64.rpm"
RPM_HASH = "d38fdf1233ca590a8d18da95fa1fca63d7c16f0413f572b3e91f53fb97fd6815ab16fcb71b8b5a148f806af5c555475951b8738c8066763335175d2c2ad8d1bd"

RPROVIDES:${PN} += "perl(Devel::PatchPerl) perl(Devel::PatchPerl::Hints) perl(Devel::PatchPerl::Plugin) perl-Devel-PatchPerl perl-Devel-PatchPerl(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0) perl(File::pushd) perl(Module::Pluggable)"

inherit rpm
