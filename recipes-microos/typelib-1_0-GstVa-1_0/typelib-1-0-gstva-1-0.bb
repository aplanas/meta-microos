SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstVa-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "a5a3222e1b97445bfa334b858808a4d0eac46d885c96c11f3994e0d0c72b7d0dab735e986847cebea50d452ad6fceb093502f764e96aad37e176fbd9401c15dd"

RPROVIDES:${PN} += "typelib(GstVa) typelib-1_0-GstVa-1_0 typelib-1_0-GstVa-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstva-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase) typelib(GstVideo)"

inherit rpm
