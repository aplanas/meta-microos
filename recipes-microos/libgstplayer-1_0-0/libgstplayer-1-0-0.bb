SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstplayer-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "ab8cab6683f7e07215fc878f7970f57a44acc97fe3c4eb6c3e60abe82030e0709345267ed56c63d32f419d9af6e3657c47d8465a4926c6f2f0276c890fc1c540"

RPROVIDES:${PN} += "libgstplayer-1.0.so.0()(64bit) libgstplayer-1_0-0 libgstplayer-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstplay-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit)"

inherit rpm
