SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstplayer-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "2e3643a2b9066b4b3a03f35580be97aa6dc09a9b742856dab012b54d87804100f8034cef24df8abb3541d3215e0ecfef535316a5883e07da427ad93f5b97e640"

RPROVIDES:${PN} += "libgstplayer-1.0.so.0()(64bit) libgstplayer-1_0-0 libgstplayer-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstplay-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit)"

inherit rpm
