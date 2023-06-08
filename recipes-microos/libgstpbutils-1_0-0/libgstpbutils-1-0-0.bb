SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstpbutils-1_0-0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "d7cfa4b562eb45b32124eea3c28471d28810f6d0fad9b3a037b7aa54b4fb40e4ebc8acf8b4e4b8bfd42bda6c585fe7de96cea2b9ad807941028327635ee546e6"

RPROVIDES:${PN} += "libgstpbutils-1.0.so.0()(64bit) libgstpbutils-1_0-0 libgstpbutils-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gstreamer-plugins-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgsttag-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit)"

inherit rpm
