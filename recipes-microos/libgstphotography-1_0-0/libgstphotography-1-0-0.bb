SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related,from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstphotography-1_0-0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "2dd201afee12c48f2b537af1b6e1ae87d90824bfdd37627358cfeee214abf8af1c5f86904ed62aa00e0c868ec2a5cc6e0800b9b72b94bc2dd1dbb4905e94e166"

RPROVIDES:${PN} += "libgstphotography-1.0.so.0()(64bit) libgstphotography-1_0-0 libgstphotography-1_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit)"

inherit rpm
