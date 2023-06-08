SUMMARY = "Development utilities from the GNU C Library"
DESCRIPTION = "The glibc-utils package contains mtrace, a memory leak tracer and \
xtrace, a function call tracer which can be helpful during program \
debugging. \
 \
If you are unsure if you need this, do not install this package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.37"

RPM_NAME = "glibc-utils-2.37-3.1.aarch64.rpm"
RPM_HASH = "53ff1496268f43e13a8039dce516ccbe439d5c3459f250ba97359989b462648ff4a992ec0d0205defc6ed12f7a2047794b51167016d507a267dcdd265a7385d3"

RPROVIDES:${PN} += "glibc-utils glibc-utils(aarch-64) libmemusage.so()(64bit) libpcprofile.so()(64bit)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/perl glibc ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgd.so.3()(64bit) libm.so.6()(64bit) libpng16.so.16()(64bit) libz.so.1()(64bit)"

inherit rpm
