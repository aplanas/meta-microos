SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "7.5.0+r278197"

RPM_NAME = "libgo11-7.5.0+r278197-14.3.aarch64.rpm"
RPM_HASH = "295367994d6ac90e2215193a2eb10c6e7acc578577844270b5feb30e927fcb6989052299c2a40ebc663d17d22f4abab89bf02eddeb2ea64a4a5edfdf798e5b8b"

RPROVIDES:${PN} += "libgo.so.11()(64bit) libgo11 libgo11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
