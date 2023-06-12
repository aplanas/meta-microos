SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstaudio-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "c80a72fafbe28c569b34c48ef19345bf7cdaa5b4feb9cbf6c5181e2b1ba5985a16651a788ea2f21e3d97f5cce2c37ca769b612f47857d6b71c06c432eae73535"

RPROVIDES:${PN} += "libgstaudio-1.0.so.0()(64bit) libgstaudio-1_0-0 libgstaudio-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gstreamer-plugins-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgsttag-1.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) liborc-0.4.so.0()(64bit)"

inherit rpm
