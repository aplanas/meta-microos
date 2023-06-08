SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstcodecparsers-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "364584acf5487e518c89c0a20bfa3a0fada5dce81e1a7d2d9d433370b1e812f152cee774364859500c2b85dd26f8c60aa1c5541b8a7dfd9e1f62bfa0dbeab998"

RPROVIDES:${PN} += "libgstcodecparsers-1.0.so.0()(64bit) libgstcodecparsers-1_0-0 libgstcodecparsers-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
