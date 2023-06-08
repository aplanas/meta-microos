SUMMARY = "Binary Decision Diagram manipulation library"
DESCRIPTION = "CUDD is a package for the manipulation of Binary Decision Diagrams \
(BDDs), Algebraic Decision Diagrams (ADDs) and Zero-suppressed Binary \
Decision Diagrams (ZDDs)."
LICENSE = "BSD-3-Clause"

PV = "3.0.0"

RPM_NAME = "libcudd-3_0_0-0-3.0.0-3.14.aarch64.rpm"
RPM_HASH = "849e23d0189b4a9ac317ccd50addf0740ecdc1284b4139346021f889c860e56edd607305818910ef289ed0f5fd17461520a1e2542c946ab695562ffd5669098b"

RPROVIDES:${PN} += "libcudd-3.0.0.so.0()(64bit) libcudd-3_0_0-0 libcudd-3_0_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
