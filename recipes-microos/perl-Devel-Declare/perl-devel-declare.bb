SUMMARY = "(DEPRECATED) Adding keywords to perl, in perl"
DESCRIPTION = "Devel::Declare can install subroutines called declarators which locally \
take over Perl's parser, allowing the creation of new syntax. \
 \
This document describes how to create a simple declarator."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.006022"

RPM_NAME = "perl-Devel-Declare-0.006022-1.17.aarch64.rpm"
RPM_HASH = "d27a2c7537b9b68d032870498120fe3d7ac3c0482d24e7c25980caf209eac9fa9666d502fa00a5a7e335d263c33f4e50baf39c5aebc484ddd25e952cf5978161"

RPROVIDES:${PN} += "perl(Devel::Declare) perl(Devel::Declare::Context::Simple) perl(Devel::Declare::MethodInstaller::Simple) perl-Devel-Declare perl-Devel-Declare(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0) perl(B::Hooks::EndOfScope) perl(B::Hooks::OP::Check) perl(Sub::Name)"

inherit rpm
