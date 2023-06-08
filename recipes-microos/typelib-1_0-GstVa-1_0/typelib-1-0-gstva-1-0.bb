SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstVa-1_0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "347d3cd80cc9047e317521e12ff542fcdec455c860a5eab687d8108cbf38470ee1fe68cb114f45278be947ea628f1e21e2e51d2b18bf66b70526d5fb70093183"

RPROVIDES:${PN} += "typelib(GstVa) typelib-1_0-GstVa-1_0 typelib-1_0-GstVa-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstva-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase) typelib(GstVideo)"

inherit rpm
