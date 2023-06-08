SUMMARY = "X11 Resource Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-res0-1.15-2.2.aarch64.rpm"
RPM_HASH = "2224f00935d9d1eec72228d730be54ca4427678603726893fdabe7a9e7b880ca4fda8ec3cd1dd0610ff99c7470f63ef725f53aecf0d71c9cf75e2960ba66f0a8"

RPROVIDES:${PN} += "libxcb-res.so.0()(64bit) libxcb-res0 libxcb-res0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxcb.so.1()(64bit)"

inherit rpm
