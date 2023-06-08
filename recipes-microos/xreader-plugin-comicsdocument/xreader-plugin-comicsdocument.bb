SUMMARY = "Comics document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read Comics documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-comicsdocument-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "f7a9cb95b61bb2a4daac0bb645ce0fc2ae1b68a9c45111954dff644fd9fe2427e0c99eca83e5e7410c67db86b8e0a8d86c791435c57ee32d7f4f5aa4965238bc"

RPROVIDES:${PN} += "libcomicsdocument.so()(64bit) xreader-plugin-comicsdocument xreader-plugin-comicsdocument(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libxreaderdocument.so.3()(64bit) xreader"

inherit rpm
