SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "12.3.0+git1204"

RPM_NAME = "libgdruntime3-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "1e8fe42f9c1659d5a5019b61bd7272414192ef5e49d5a134b00b5b5524172df69c8b44967632f5bf49641a93a967d830667b8d64bd13e2bea7de2c5c5a6e9bfa"

RPROVIDES:${PN} += "libgdruntime.so.3()(64bit) libgdruntime3 libgdruntime3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
