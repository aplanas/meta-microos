SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstinsertbin-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "348fcc5537a33f703456838c44dc569de377232e00ab8a730278b5714d664fd92fc4119216c5e1a89d92aa741a700bb48dbf9a3af8a5ec090ce8c3062c15036e"

RPROVIDES:${PN} += "libgstinsertbin-1.0.so.0()(64bit) libgstinsertbin-1_0-0 libgstinsertbin-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
