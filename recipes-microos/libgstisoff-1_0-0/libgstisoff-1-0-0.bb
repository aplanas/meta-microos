SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstisoff-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "bc1f321512088813438f61b6fba419844d4b0fe182b5cef01031e08478c3d61fe9f573af31419b627e1fb2d0b9af6d7e1270d71272cb3e77ff09559e06cad915"

RPROVIDES:${PN} += "libgstisoff-1.0.so.0()(64bit) libgstisoff-1_0-0 libgstisoff-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
