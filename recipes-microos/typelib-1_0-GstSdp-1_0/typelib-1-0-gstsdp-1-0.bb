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

RPM_NAME = "typelib-1_0-GstSdp-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "e85ba16a9880f64b9dae2ad9c090b79ab965384c0a9b1e6fefd182ddaa5ee8ab60da2ea5e3e3ac7a8583174c33dd2497c02955ee1d603b5d9242716a015bf479"

RPROVIDES:${PN} += "typelib(GstSdp) typelib-1_0-GstSdp-1_0 typelib-1_0-GstSdp-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstsdp-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst)"

inherit rpm
