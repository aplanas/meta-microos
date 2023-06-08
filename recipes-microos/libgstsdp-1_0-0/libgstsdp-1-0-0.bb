SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstsdp-1_0-0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "b3bf31b138fdf70065dca0ae5d1e017f6660ce43966d578d5a27c3ef90ce31dd57da37b89a97367ae2ddb041083a66c6f5b4ee20e6ac7b5d86435ca39edf4af1"

RPROVIDES:${PN} += "libgstsdp-1.0.so.0()(64bit) libgstsdp-1_0-0 libgstsdp-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gstreamer-plugins-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstrtp-1.0.so.0()(64bit)"

inherit rpm
