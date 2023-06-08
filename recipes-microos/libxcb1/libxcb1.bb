SUMMARY = "X11 core protocol C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb1-1.15-2.2.aarch64.rpm"
RPM_HASH = "33af7110cfee83e14bcc12cee4621969979e6356ed7ffbb2a4676fe899502aef2dcb11e0c3f06829ccd96bc232dc5a03de491f7c9db95367a0a310a8f6fe2599"

RPROVIDES:${PN} += "libxcb.so.1()(64bit) libxcb1 libxcb1(aarch-64) xorg-x11-libxcb"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libXau.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
