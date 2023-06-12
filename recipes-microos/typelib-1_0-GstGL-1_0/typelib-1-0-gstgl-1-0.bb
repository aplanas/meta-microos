SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins. \
 \
This package provides the GObject Introspection bindings for GStreamer \
plug-ins."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstGL-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "30cbe8fd743b5c2b6921eb8a5a7cd6e44fca1254f0da5b4cfcbf676f0763e283741efc0eee31630c00ea18a4259aefd3fcc1f5c9949c82c9e01c3f55ce6667d8"

RPROVIDES:${PN} += "typelib(GstGL) typelib-1_0-GstGL-1_0 typelib-1_0-GstGL-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstgl-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase) typelib(GstVideo)"

inherit rpm
