SUMMARY = "Arbitrary precision math library"
DESCRIPTION = "Part of the calc release consists of an arbitrary precision math link \
library.  This link library is used by the calc program to perform its \
own calculations.  If you wish, you can ignore the calc program entirely \
and call the arbitrary precision math routines from your own C programs."
LICENSE = "LGPL-2.1-only"

PV = "2.14.1.5"

RPM_NAME = "libcalc2_14_1_5-2.14.1.5-1.3.aarch64.rpm"
RPM_HASH = "61e71fc578592b317eb0abf0f9b9276a5450630a945a5b2b3ba5f8b67076255e5117649bc4242256c7319e8dc1bd375ecbe60ffd173231b2c34e6430829da88e"

RPROVIDES:${PN} += "libcalc.so.2.14.1.5()(64bit) libcalc2_14_1_5 libcalc2_14_1_5(aarch-64) libcustcalc.so.2.14.1.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.36)(64bit) libreadline.so.8()(64bit)"

inherit rpm
