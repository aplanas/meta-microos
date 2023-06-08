SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgsttag-1_0-0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "3e74c4ecd6ad91cd4362fa9b3619873807df393cef2abcc793a7a3d580d19776b38c1bd260e1bd06bb797499c6458d1f4ebb1e50635b0fc36c4a76cc2f319754"

RPROVIDES:${PN} += "libgsttag-1.0.so.0()(64bit) libgsttag-1_0-0 libgsttag-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gstreamer-plugins-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libz.so.1()(64bit)"

inherit rpm
