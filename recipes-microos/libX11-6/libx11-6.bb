SUMMARY = "Core X11 protocol client library"
DESCRIPTION = "The X Window System is a network-transparent window system that was \
designed at MIT. X display servers run on computers with either \
monochrome or color bitmap display hardware. The server distributes \
user input to and accepts output requests from various client \
programs located either on the same machine or elsewhere in the \
network. Xlib is a C subroutine library that application programs \
(clients) use to interface with the window system by means of a \
stream connection."
LICENSE = "MIT"

PV = "1.8.4"

RPM_NAME = "libX11-6-1.8.4-1.3.aarch64.rpm"
RPM_HASH = "fba54a27c3c1e194c94f9e98d0a09f38bd2c7ec7052d90dcfcac6314606279e12d93b4df390877e6a55eea7ca203321a2b12e0964fc1f84c960dd84fa1109a3c"

RPROVIDES:${PN} += "libX11-6 libX11-6(aarch-64) libX11.so.6()(64bit) xorg-x11-libX11"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11-data libc.so.6(GLIBC_2.34)(64bit) libxcb.so.1()(64bit)"

inherit rpm
