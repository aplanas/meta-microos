SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstInsertBin-1_0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "8e7ae64e37dc4ae9cbb84a1c9bfe394d39bb3320540998433c58b19a3538b60c5fe69b14dae5c90c12889e1fcfe9979632cd832990997f66006017f343f388da"

RPROVIDES:${PN} += "typelib(GstInsertBin) typelib-1_0-GstInsertBin-1_0 typelib-1_0-GstInsertBin-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstinsertbin-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst)"

inherit rpm
