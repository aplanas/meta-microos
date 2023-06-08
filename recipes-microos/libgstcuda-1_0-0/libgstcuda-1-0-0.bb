SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstcuda-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "48656a1c0e8c35411ed16c43322d19785ef7f96d787f83e96090879938def79176f7602f1de695c2a715cfbc1b2c743feabd8490abf9268044e7fd59c6e492ea"

RPROVIDES:${PN} += "libgstcuda-1.0.so.0()(64bit) libgstcuda-1_0-0 libgstcuda-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstgl-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit)"

inherit rpm
