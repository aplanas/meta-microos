SUMMARY = "Chromaprint plugin for GStreamer"
DESCRIPTION = "Add chromaprint (Audio Fingerprinting) support to any GStreamer based tool."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-plugins-bad-chromaprint-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "39dbd9e8164f240860ce0084f631693634209391e170d2592a2388c3a2d782e0e8f6875c8f65d5810474d448c0a4d108b06edc31d367ad3ccdf156b50720f249"

RPROVIDES:${PN} += "gstreamer-plugins-bad-chromaprint gstreamer-plugins-bad-chromaprint(aarch-64) gstreamer1(element-chromaprint)()(64bit) libgstchromaprint.so()(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libchromaprint.so.1()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
