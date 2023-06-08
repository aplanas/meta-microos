SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstapp-1_0-0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "c931c57f5ad75da34832ba7547c9fe9a30f769e8a2a2299d5288cdad07d6dbdd0af3760ed6f227b152d875b4a1c9e03a7c5502438a6679d624c77273fc2472be"

RPROVIDES:${PN} += "libgstapp-1.0.so.0()(64bit) libgstapp-1_0-0 libgstapp-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gstreamer-plugins-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
