SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstplay-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "6bdd52187769b2dc424a6a4c8b4364abe38e890736694ca6147418cf0fea490048e13ac02e88779edad184a60db02c733ec54069d692bb01dad4e55b6dd2062d"

RPROVIDES:${PN} += "libgstplay-1.0.so.0()(64bit) \
libgstplay-1_0-0 \
libgstplay-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgsttag-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit)"

inherit rpm
