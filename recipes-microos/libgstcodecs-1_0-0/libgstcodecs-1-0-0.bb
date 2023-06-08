SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstcodecs-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "0e07c2aaa00d3b5c087152abfbefebd1561c64ededaf08eabc648ea93e9b93e18a74446c57ce33a9a866d771cc7dce0618758578d1936d3bd549dabd47964f9e"

RPROVIDES:${PN} += "libgstcodecs-1.0.so.0()(64bit) libgstcodecs-1_0-0 libgstcodecs-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstcodecparsers-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit)"

inherit rpm
