SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstsctp-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "234cf1a0ee760048bde82438a36b740c4c0e843086bd876df0d3a64995648d2371f391c39e297e94da8300e7c11461ca7f78772540614c75b87e52dd81df50d7"

RPROVIDES:${PN} += "libgstsctp-1.0.so.0()(64bit) libgstsctp-1_0-0 libgstsctp-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libglib-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
