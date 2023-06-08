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

RPM_NAME = "typelib-1_0-GstGLEGL-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "73899247fdfce0b47578058b9e7ec402162680e7e300cbcbd985c109338fecd5cdddf70aad317a86ded90f22ef02923bd0ec2a79d879758472d834e0cc0b7962"

RPROVIDES:${PN} += "typelib(GstGLEGL) typelib-1_0-GstGLEGL-1_0 typelib-1_0-GstGLEGL-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstgl-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase) typelib(GstGL) typelib(GstVideo)"

inherit rpm
