SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "libgstpbutils-1_0-0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "56225367e6318c164cab68708816ccbb49fe56a2433852c22311bd8d62f6e9fa50a1bd08f1cd68f81fa1323398019f1cbdbf333c6afd407ca4d51eff5be6cef3"

RPROVIDES:${PN} += "libgstpbutils-1.0.so.0()(64bit) libgstpbutils-1_0-0 libgstpbutils-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gstreamer-plugins-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgsttag-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit)"

inherit rpm
