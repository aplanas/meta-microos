SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstvideo-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "e6e69dc9abd1ae4071993e9b7d2c6c1b5b1d147017940715682830e2f2a83174e01dd0b0d9f00b0d8d76729e275132f48df4c41e72db5b80e4c1117b4c50c977"

RPROVIDES:${PN} += "libgstvideo-1.0.so.0()(64bit) libgstvideo-1_0-0 libgstvideo-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gstreamer-plugins-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) liborc-0.4.so.0()(64bit)"

inherit rpm
