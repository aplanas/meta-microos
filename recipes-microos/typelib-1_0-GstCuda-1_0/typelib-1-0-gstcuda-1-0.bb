SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstCuda-1_0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "d1e64954805fdbe7b13cf8f753a2b0632db07c2f7039a7b325d44ce66deff3c04def4f7f6e9dcb487e1a9af6beffcac93228087d3fb9782a6a25a32aec052aa5"

RPROVIDES:${PN} += "typelib(GstCuda) typelib-1_0-GstCuda-1_0 typelib-1_0-GstCuda-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstcuda-1.0.so.0()(64bit) typelib(CudaGst) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase) typelib(GstGL) typelib(GstVideo)"

inherit rpm
