SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstplay-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "d4cc577da9d88c6864d307b0e0d7ab4dd2cef2aca6b5023c001938b9d28925d5b412f05da00d354f482991e49b49cfad09b49f1aa142baef078d694648517c1a"

RPROVIDES:${PN} += "libgstplay-1.0.so.0()(64bit) libgstplay-1_0-0 libgstplay-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgsttag-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit)"

inherit rpm
