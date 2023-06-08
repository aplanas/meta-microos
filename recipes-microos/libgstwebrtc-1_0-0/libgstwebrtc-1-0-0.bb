SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstwebrtc-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "6f4fd5e299b7b60f126ad40f238fea2addc1926cba87a1119f97d40f4170f72ae957cfb16374b2470dcd14aa43be20ebf891f336516dbbf68731ce6a732f4fbb"

RPROVIDES:${PN} += "libgstwebrtc-1.0.so.0()(64bit) libgstwebrtc-1_0-0 libgstwebrtc-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstsdp-1.0.so.0()(64bit)"

inherit rpm
