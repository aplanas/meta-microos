SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstallocators-1_0-0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "478aedba2ea430ea22f936ad4e325e0e17c9860e8c5d1675f3346c1400d36fbdfe161a86adb6abaff9b841124d058a979360ecfe1f192fe4838a218e3264af59"

RPROVIDES:${PN} += "libgstallocators-1.0.so.0()(64bit) libgstallocators-1_0-0 libgstallocators-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gstreamer-plugins-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
