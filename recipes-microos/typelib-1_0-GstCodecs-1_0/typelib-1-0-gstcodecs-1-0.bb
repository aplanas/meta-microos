SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstCodecs-1_0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "dbfb4fee7d3f4135377e17fd28cb64400f49e82417c55a1e2a84e2371ea517b267f7e9d54ca8973665b54463dfee1ef84494f27281138963297c49596e95bb6b"

RPROVIDES:${PN} += "typelib(GstCodecs) typelib-1_0-GstCodecs-1_0 typelib-1_0-GstCodecs-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstcodecs-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase) typelib(GstVideo)"

inherit rpm
