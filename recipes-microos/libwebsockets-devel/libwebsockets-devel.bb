SUMMARY = "Development files for libwebsockets"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the WebSockets library."
LICENSE = "MIT"

PV = "4.3.2"

RPM_NAME = "libwebsockets-devel-4.3.2-2.1.aarch64.rpm"
RPM_HASH = "df03693e41d55fa114a6eb5676e690f30d69d66c10c1d948ba5a37e9812bab5b3e7a10544f754dda9f908ca64055f98513894cada06df61ba6598f647ae7d51c"

RPROVIDES:${PN} += "cmake(libwebsockets) libwebsockets-devel libwebsockets-devel(aarch-64) libwebsockets-evlib_uv.so()(64bit) pkgconfig(libwebsockets)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libuv.so.1()(64bit) libwebsockets.so.19()(64bit) libwebsockets19 openssl-devel"

inherit rpm
