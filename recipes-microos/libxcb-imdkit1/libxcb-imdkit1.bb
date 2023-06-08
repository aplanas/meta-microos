SUMMARY = "An implementation of xim protocol in xcb"
DESCRIPTION = "xcb-imdkit is an implementation of xim protocol in xcb, comparing with the \
implementation of IMDkit with Xlib, and xim inside Xlib, it has less memory \
foot print, better performance, and safer on malformed client."
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "libxcb-imdkit1-1.0.5-1.1.aarch64.rpm"
RPM_HASH = "e13f465b6bd0ab6661ab339519fd047c3c79830a59cc9a0c2e46d6e3764cafcbb978bafd2cc90a42a9659cac06173f7c3d8b304f8edc32ce153ce14d462196a9"

RPROVIDES:${PN} += "libxcb-imdkit.so.1()(64bit) libxcb-imdkit1 libxcb-imdkit1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libxcb-util.so.1()(64bit) libxcb.so.1()(64bit)"

inherit rpm
