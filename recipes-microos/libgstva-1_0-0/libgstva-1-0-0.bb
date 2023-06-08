SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstva-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "4c9e568e3aacaa3b18e23a1228a28e5bebf0a8bad2fb50ba1e24c772ffe82c967f86a8c81f35aa4db3050af912c7ecffb965ee5fe3d5a665251ca604530154bf"

RPROVIDES:${PN} += "libgstva-1.0.so.0()(64bit) libgstva-1_0-0 libgstva-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdrm.so.2()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstallocators-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libva-drm.so.2()(64bit) libva.so.2()(64bit) libva.so.2(VA_API_0.33.0)(64bit)"

inherit rpm
