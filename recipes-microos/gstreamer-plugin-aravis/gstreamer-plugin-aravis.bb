SUMMARY = "Gstreamer support for aravis"
DESCRIPTION = "This package contains the gstreamer plugin for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.26"

RPM_NAME = "gstreamer-plugin-aravis-0.8.26-1.1.aarch64.rpm"
RPM_HASH = "1db753ca1aba3b36d94c465e6f5657d9ee68c0c75367dfe9fcc599b541869db86b8f308a2d7eb8ce018ca4db2dc3c992a104e4ff0f3f4cdfe81f6cc6ca4477b5"

RPROVIDES:${PN} += "gstreamer-plugin-aravis gstreamer-plugin-aravis(aarch-64) gstreamer1(element-aravissrc)()(64bit) libgstaravis.0.8.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaravis-0.8.so.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
