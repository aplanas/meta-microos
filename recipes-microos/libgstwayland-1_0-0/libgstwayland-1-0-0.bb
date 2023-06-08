SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins - Wayland backend"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstwayland-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "cf70583e60c31add67de322b101f0cfd7aaf893c24a8b38ba971d3fc32b0dcdd24aecd6feb74bc715017d33669bd0faf5eaf8fa24fff48bd37d7386796ee18a9"

RPROVIDES:${PN} += "libgstwayland-1.0.so.0()(64bit) libgstwayland-1_0-0 libgstwayland-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstallocators-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libwayland-client.so.0()(64bit)"

inherit rpm
