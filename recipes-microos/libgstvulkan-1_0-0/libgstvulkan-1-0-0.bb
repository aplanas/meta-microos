SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstvulkan-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "318c5df8c19642dd28ce7714e3c58eb116f6d4b622f5634a1739586d4a0aa88c36608642bca2e273bff1bda80878dbcbea071aa5d10242531c55b29dea0e8144"

RPROVIDES:${PN} += "libgstvulkan-1.0.so.0()(64bit) libgstvulkan-1_0-0 libgstvulkan-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libvulkan.so.1()(64bit) libwayland-client.so.0()(64bit) libxcb.so.1()(64bit) libxkbcommon-x11.so.0()(64bit) libxkbcommon-x11.so.0(V_0.5.0)(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
