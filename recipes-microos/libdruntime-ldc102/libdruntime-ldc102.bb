SUMMARY = "Minimal D runtime library"
DESCRIPTION = "The minimal runtime library required to support the D programming language."
LICENSE = "Artistic-1.0 & BSD-3-Clause"

PV = "1.32.0"

RPM_NAME = "libdruntime-ldc102-1.32.0-1.1.aarch64.rpm"
RPM_HASH = "aadd5ced77143ca8a0ca21cd3d0e4011b8b6c42cfa6418d3ded837fca02533653fd19ebc832fdd5e5613d6004c63c34981fa3e164dd159d5bc16c4f396a6e1e1"

RPROVIDES:${PN} += "libdruntime-ldc-debug-shared.so.102()(64bit) libdruntime-ldc-shared.so.102()(64bit) libdruntime-ldc102 libdruntime-ldc102(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
