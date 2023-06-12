SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstbadaudio-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "e8f7e78e20ec2a0eb8ac596d103261a2df7ca8de56adf7900cd042bb9af94096ee60e2a78bf54230ab2f39578f416f7651aa4f661e4f37c1a21f8df0e265c467"

RPROVIDES:${PN} += "libgstbadaudio-1.0.so.0()(64bit) libgstbadaudio-1_0-0 libgstbadaudio-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
