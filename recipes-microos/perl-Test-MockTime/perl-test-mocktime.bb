SUMMARY = "Replaces actual time with simulated time"
DESCRIPTION = "This module was created to enable test suites to test code at specific \
points in time. Specifically it overrides localtime, gmtime and time at \
compile time and then relies on the user supplying a mock time via \
set_relative_time, set_absolute_time or set_fixed_time to alter future \
calls to gmtime,time or localtime."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.17"

RPM_NAME = "perl-Test-MockTime-0.17-1.17.noarch.rpm"
RPM_HASH = "e71298b98c07bd160c596fef48e25beaf8c36c28d47766a13a60efa4eb6b417b0bd621c5538e3df636733148762cff8c1ceb2ebcad43164541ea14387fed1dc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::MockTime) \
perl-Test-MockTime"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Time::Piece)"

inherit rpm
