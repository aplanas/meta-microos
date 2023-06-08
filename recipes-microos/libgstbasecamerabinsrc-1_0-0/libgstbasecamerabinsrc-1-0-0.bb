SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstbasecamerabinsrc-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "db888068d6b10f9e3e2d764918575de03aa6164d6ee7805aafa839e0580aad7b7673163160684ff97c1d4aec653aa35e40bafc93ad77dc38bd2dc58da1116f09"

RPROVIDES:${PN} += "libgstbasecamerabinsrc-1.0.so.0()(64bit) libgstbasecamerabinsrc-1_0-0 libgstbasecamerabinsrc-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstapp-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
