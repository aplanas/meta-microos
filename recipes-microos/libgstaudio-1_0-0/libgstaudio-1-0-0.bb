SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstaudio-1_0-0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "925deba4fd83e8019c45218b5887af2d17765f9e4b2ca66ff1b5709a7a2669b59f45aa1ddbc8c8cbabb06e5a7ec079ade0b9443c6eb3aa79188459b7e8620d1f"

RPROVIDES:${PN} += "libgstaudio-1.0.so.0()(64bit) libgstaudio-1_0-0 libgstaudio-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gstreamer-plugins-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgsttag-1.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) liborc-0.4.so.0()(64bit)"

inherit rpm
