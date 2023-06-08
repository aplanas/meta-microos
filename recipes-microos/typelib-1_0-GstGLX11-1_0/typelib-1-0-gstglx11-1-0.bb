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

RPM_NAME = "typelib-1_0-GstGLX11-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "bcd434d42b1ed1987c71d6cbcfa83e1aabe7a04a76dce6a4bff0a366ea4a5d61da271eced6ee3b3c77734d831b0b9cba0a5695078d0cba34ce1fad36793e83bf"

RPROVIDES:${PN} += "typelib(GstGLX11) typelib-1_0-GstGLX11-1_0 typelib-1_0-GstGLX11-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstgl-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase) typelib(GstGL) typelib(GstVideo)"

inherit rpm
