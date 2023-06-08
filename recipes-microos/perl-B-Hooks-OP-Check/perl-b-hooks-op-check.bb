SUMMARY = "Wrap OP check callbacks"
DESCRIPTION = "This module provides a C API for XS modules to hook into the callbacks of \
'PL_check'. \
 \
ExtUtils::Depends is used to export all functions for other XS modules to \
use. Include the following in your Makefile.PL: \
 \
    my $pkg = ExtUtils::Depends->new('Your::XSModule', 'B::Hooks::OP::Check'); \
    WriteMakefile( \
        ... # your normal makefile flags \
        $pkg->get_makefile_vars, \
    ); \
 \
Your XS module can now include 'hook_op_check.h'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.22"

RPM_NAME = "perl-B-Hooks-OP-Check-0.22-1.29.aarch64.rpm"
RPM_HASH = "d07b67bc0783d1e01166888a5473366e7fdd8f87b1d8554946c7deaa0d7bb32b300155c6262006e23e2706ad8b4163d8ae004f8d506bd2b4705a2259357c24a6"

RPROVIDES:${PN} += "perl(B::Hooks::OP::Check) perl(B::Hooks::OP::Check::Install::Files) perl-B-Hooks-OP-Check perl-B-Hooks-OP-Check(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(parent)"

inherit rpm
