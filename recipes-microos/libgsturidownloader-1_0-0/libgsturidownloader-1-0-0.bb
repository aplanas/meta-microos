SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgsturidownloader-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "2961de97a97b36aa64dafe83abc95511879cb30ed38e83179195cddd27a2a97c258a8782716582f1d7d4828e3a8a37ca8f324a4a2b78c4b877400b7b20c11824"

RPROVIDES:${PN} += "libgsturidownloader-1.0.so.0()(64bit) libgsturidownloader-1_0-0 libgsturidownloader-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
