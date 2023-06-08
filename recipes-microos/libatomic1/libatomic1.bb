SUMMARY = "The GNU Compiler Atomic Operations Runtime Library"
DESCRIPTION = "The runtime library for atomic operations of the GNU Compiler Collection (GCC)."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "13.0.1+git7231"

RPM_NAME = "libatomic1-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "1c511e203afac16ceb88e70f80125933fd3305a1f9721f1ae23f9051697b30ea85876f0d6334d6b85b52bba53d0d1a9991773a8182b149c42656c65e2ba5615d"

RPROVIDES:${PN} += "libatomic.so.1()(64bit) libatomic.so.1(LIBATOMIC_1.0)(64bit) libatomic.so.1(LIBATOMIC_1.1)(64bit) libatomic.so.1(LIBATOMIC_1.2)(64bit) libatomic1 libatomic1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
