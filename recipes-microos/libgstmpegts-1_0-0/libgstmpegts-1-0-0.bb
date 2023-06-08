SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstmpegts-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "317d3f90b6dcdeedac14ae39f87d51af75058afd7bbeda50a0764310addb77eef86fb60d103d0d84e734d68c8e89e6cef5044c68b3136f0800fb8fb4ca310087"

RPROVIDES:${PN} += "libgstmpegts-1.0.so.0()(64bit) libgstmpegts-1_0-0 libgstmpegts-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
