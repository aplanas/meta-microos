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

RPM_NAME = "typelib-1_0-GstGLWayland-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "a27253ff3b5d1115a6bfcd7d8203d2cf438d3138fb92f801470167bb52b62c453bfd0038cab953afa023abe9190fc4babf777120089df2c02f7277d63f71350f"

RPROVIDES:${PN} += "typelib(GstGLWayland) typelib-1_0-GstGLWayland-1_0 typelib-1_0-GstGLWayland-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstgl-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase) typelib(GstGL) typelib(GstVideo)"

inherit rpm
