SUMMARY = "X11 XFree86-DRI Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-xf86dri0-1.15-2.2.aarch64.rpm"
RPM_HASH = "164e5bfa3a79307bb8b95553256e3ac17018cc3c79f71e778d4b12c4aa46b4be3f23f2d5ec773a3838de23be986ce315300beb2c02f538deabd4c98c6f0bad77"

RPROVIDES:${PN} += "libxcb-xf86dri.so.0()(64bit) libxcb-xf86dri0 libxcb-xf86dri0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxcb.so.1()(64bit)"

inherit rpm
