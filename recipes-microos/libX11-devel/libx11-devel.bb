SUMMARY = "Development files for the Core X11 protocol library"
DESCRIPTION = "The X Window System is a network-transparent window system that was \
designed at MIT. X display servers run on computers with either \
monochrome or color bitmap display hardware. The server distributes \
user input to and accepts output requests from various client \
programs located either on the same machine or elsewhere in the \
network. Xlib is a C subroutine library that application programs \
(clients) use to interface with the window system by means of a \
stream connection. \
 \
This package contains the development headers for the library found \
in libX11-6 and libX11-xcb1."
LICENSE = "MIT"

PV = "1.8.4"

RPM_NAME = "libX11-devel-1.8.4-1.3.aarch64.rpm"
RPM_HASH = "2a430adb9b4d0ad84ccc3a55d7bf1b06965745092899b76c9b03441e6adfd529f12e77ae555eced03a0cffd34f49ff07c681874da546376e853753caca3bed7b"

RPROVIDES:${PN} += "libX11-devel libX11-devel(aarch-64) pkgconfig(x11) pkgconfig(x11-xcb) xorg-x11-libX11-devel xorgproto-devel:/usr/include/X11/extensions/XKBgeom.h"
RDEPENDS:${PN} += "/usr/bin/pkg-config libX11-6 libX11-xcb1 pkgconfig(kbproto) pkgconfig(x11) pkgconfig(xcb) pkgconfig(xproto)"

inherit rpm
