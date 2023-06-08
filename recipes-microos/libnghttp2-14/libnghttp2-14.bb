SUMMARY = "Shared library for nghttp2"
DESCRIPTION = "Shared C libraries for implementation of Hypertext Transfer Protocol \
version 2."
LICENSE = "MIT"

PV = "1.52.0"

RPM_NAME = "libnghttp2-14-1.52.0-1.1.aarch64.rpm"
RPM_HASH = "ee113174daa9fdb9137ace2b0320542f082accd3dbe80960d7ec9045a9a6fcfab8a935369376d041dd7a0d4a8c6edcbd23c0e7e6da2849229f1d3576d86ee53e"

RPROVIDES:${PN} += "libnghttp2-14 libnghttp2-14(aarch-64) libnghttp2.so.14()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
