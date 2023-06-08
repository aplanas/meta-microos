SUMMARY = "Development files for the XCB utility modules"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. These experimental libraries provide convenience functions \
and interfaces which make the raw X protocol more usable. Some of the \
libraries also provide client-side code which is not strictly part of \
the X protocol but which have traditionally been provided by Xlib. \
 \
This package contains the development headers for the library found \
in libxcb-util1."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "xcb-util-devel-0.4.1-1.2.aarch64.rpm"
RPM_HASH = "c6e1d0dccee2b72a468fa78b15add2eff944b85e7930c3e4aee46be6abca9d2cc4b0f5f6c7d4ab219e9936ea7865a224ec3d0457d0642bb7aeb5f19d519d6846"

RPROVIDES:${PN} += "pkgconfig(xcb-atom) pkgconfig(xcb-aux) pkgconfig(xcb-event) pkgconfig(xcb-util) xcb-util-devel xcb-util-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libxcb-util1 pkgconfig(xcb)"

inherit rpm
