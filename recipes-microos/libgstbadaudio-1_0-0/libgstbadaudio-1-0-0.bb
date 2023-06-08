SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstbadaudio-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "71310533818c686265ed19aeab88785fe2d37b8562bb9a8bdbeab8c11ec7e46ae33f714275074deccc58cfa099796915d5b9b9b9fc6d56dfdc86381f4d3971e8"

RPROVIDES:${PN} += "libgstbadaudio-1.0.so.0()(64bit) libgstbadaudio-1_0-0 libgstbadaudio-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstaudio-1.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
