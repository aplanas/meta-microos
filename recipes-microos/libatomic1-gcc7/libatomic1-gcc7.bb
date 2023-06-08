SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libatomic1-gcc7-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "1b4bb8cfb8df195b44ea7ae42d5e6d6db1e4916eeb7ef89123a522bae23d1039f8919f585ccf86c8111d5a3b34b3c32f50dba52ca48da2f0ca0573c6238a5cf2"

RPROVIDES:${PN} += "libatomic.so.1()(64bit) libatomic.so.1(LIBATOMIC_1.0)(64bit) libatomic.so.1(LIBATOMIC_1.1)(64bit) libatomic.so.1(LIBATOMIC_1.2)(64bit) libatomic1 libatomic1-gcc7 libatomic1-gcc7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
