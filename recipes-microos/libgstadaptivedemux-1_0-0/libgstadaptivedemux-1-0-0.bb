SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstadaptivedemux-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "56d60fd266f6047972d23016a3027722d04df285366274b42d17437bd4a9c6ab0aa2ff8ff7a2910a876586068d81ceb45fa4aa485ae4f1d010c9f4c02548c282"

RPROVIDES:${PN} += "libgstadaptivedemux-1.0.so.0()(64bit) \
libgstadaptivedemux-1_0-0 \
libgstadaptivedemux-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgsturidownloader-1.0.so.0()(64bit)"

inherit rpm
