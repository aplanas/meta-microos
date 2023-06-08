SUMMARY = "Streaming-Media Framework Runtime"
DESCRIPTION = "GStreamer is a streaming-media framework, based on graphs of filters \
which operate on media data. Applications using this library can do \
anything from real-time sound processing to playing videos, and just \
about anything else media-related.  Its plug-in-based architecture \
means that new data types or processing capabilities can be added by \
installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "gstreamer-utils-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "701d2258d051ab036c46f60db3ba0eaf41ca4e04cc802152f3a6f71fdc579664c9011d4f2a4c77fce398435c2496381fed0200b7ecd6a2eb80b4fdb781381892"

RPROVIDES:${PN} += "gstreamer-utils gstreamer-utils(aarch-64) gstreamer-utils_versioned gstreamer:/usr/bin/gst-launch-1.0"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
