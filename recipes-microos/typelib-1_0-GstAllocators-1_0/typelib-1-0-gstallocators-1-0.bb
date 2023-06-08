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

RPM_NAME = "typelib-1_0-GstAllocators-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "1cad7737232ae609730dc3bec3d6e7a50e67367d076b776ee3beb56b5df873241280c8f2c35c73278626479cc7f102e51235597e292a43308936e7314c56001b"

RPROVIDES:${PN} += "typelib(GstAllocators) typelib-1_0-GstAllocators-1_0 typelib-1_0-GstAllocators-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstallocators-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst)"

inherit rpm
