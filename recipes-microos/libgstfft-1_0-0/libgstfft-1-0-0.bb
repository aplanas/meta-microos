SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstfft-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "fb6dd02a1c5d7e91fe8e1f59f91c70faea62e13af556afe2232bc157a015f0611774340070d3876d08b60b2d1eb4e62a99b4635edf78e06ec59e8ee5294066af"

RPROVIDES:${PN} += "libgstfft-1.0.so.0()(64bit) \
libgstfft-1_0-0 \
libgstfft-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-base \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
