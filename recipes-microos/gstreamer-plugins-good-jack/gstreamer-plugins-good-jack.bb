SUMMARY = "Jack plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the jack plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-plugins-good-jack-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "4184e0b0e0049edefcabe284cf969176b27d5c12ffc70bbedf8dfe8cd213daf150c2caa4fc5a8609966bfe42144ea4efef422879bcf4dbd037ecc94f6bf14c25"

RPROVIDES:${PN} += "gstreamer-plugins-good-jack gstreamer-plugins-good-jack(aarch-64) gstreamer1(element-jackaudiosink)()(64bit) gstreamer1(element-jackaudiosrc)()(64bit) libgstjack.so()(64bit)"
RDEPENDS:${PN} += "gstreamer-plugins-good ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libjack.so.0()(64bit)"

inherit rpm
