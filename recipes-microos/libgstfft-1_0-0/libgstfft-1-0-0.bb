SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstfft-1_0-0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "7fd7a7495bfe8e721acc66895c5a5a5eabd6529f63396fe367379a6b7287f20d4e5ca70de4ace5b72a4704f9bbe477c11e25d60f48d5e35eefb5cc1f777c53b6"

RPROVIDES:${PN} += "libgstfft-1.0.so.0()(64bit) libgstfft-1_0-0 libgstfft-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gstreamer-plugins-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
