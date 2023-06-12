SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstphotography-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "5eab9356c61000fb3d2e72f0dc12827fbcda6ce6cc522b838677325c58735e112f49459db7dfb511f808507673eee52a46f59978e3caaf2734080a0c7ab463c4"

RPROVIDES:${PN} += "libgstphotography-1.0.so.0()(64bit) libgstphotography-1_0-0 libgstphotography-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
