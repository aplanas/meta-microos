SUMMARY = "X FreeType library"
DESCRIPTION = "Xft is a library that connects X applications with the FreeType font \
rasterization library. Xft uses fontconfig to locate fonts so it has \
no configuration files."
LICENSE = "MIT"

PV = "2.3.8"

RPM_NAME = "libXft2-2.3.8-1.1.aarch64.rpm"
RPM_HASH = "21f4fe3b5fb7bc40794c434cca00a017e5ceaed1397caadd955366e50831c4a1325d8948ddc5b3ca8f545a4a63ebf45ee6e9269fd37969627645bd0fa6139197"

RPROVIDES:${PN} += "libXft.so.2()(64bit) libXft2 libXft2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXrender.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libfontconfig.so.1()(64bit) libfreetype.so.6()(64bit)"

inherit rpm
