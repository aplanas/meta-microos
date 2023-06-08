SUMMARY = "TIFF document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read TIFF documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "xreader-plugin-tiffdocument-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "ef447f678e42f697c94709717f91d33c84591c22651f742cd6a4075dbbd2baa2aeefea52cdedf498e769c1b737ea1e93844473382aaaebdae51712858315324e"

RPROVIDES:${PN} += "libtiffdocument.so()(64bit) xreader-plugin-tiffdocument xreader-plugin-tiffdocument(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libtiff.so.6()(64bit) libtiff.so.6(LIBTIFF_4.0)(64bit) libxreaderdocument.so.3()(64bit) xreader"

inherit rpm
