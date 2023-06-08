SUMMARY = "Frame Streams implementation in C"
DESCRIPTION = "This is fstrm, a C implementation of the Frame Streams data transport protocol. \
 \
This packages holds the shared library file."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "libfstrm0-0.6.1-1.5.aarch64.rpm"
RPM_HASH = "dd4e21940312fd1d41b39e7611527d2e7604a74c0357d33d8aba01c96f8294ae189d12821d337c084e864cd11cac09dd56690f7df61070b6f6654dfcc3c54cd5"

RPROVIDES:${PN} += "libfstrm.so.0()(64bit) libfstrm.so.0(LIBFSTRM_0.2.0)(64bit) libfstrm.so.0(LIBFSTRM_0.4.0)(64bit) libfstrm0 libfstrm0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
