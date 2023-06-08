SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstwebrtcnice-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "3a788e4dba99f42be40472bd9a709857c5ad6c1291f39466e4f77d7f84d02db09df403b40e43edf3ff04ad76d2afbc608314202088b6fa850918d26e08c8600e"

RPROVIDES:${PN} += "libgstwebrtcnice-1.0.so.0()(64bit) libgstwebrtcnice-1_0-0 libgstwebrtcnice-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstwebrtc-1.0.so.0()(64bit) libnice.so.10()(64bit)"

inherit rpm
