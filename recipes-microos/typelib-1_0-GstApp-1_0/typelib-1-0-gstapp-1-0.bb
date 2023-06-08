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

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstApp-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "2100902e1a131cd3213f20acc0431c1d3d07e4c94e13415c6d544d0561022f836304ca13eb2725822fc29563061c42b8c3af03a48c52d0919f1df11121d47f5e"

RPROVIDES:${PN} += "typelib(GstApp) typelib-1_0-GstApp-1_0 typelib-1_0-GstApp-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstapp-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase)"

inherit rpm
