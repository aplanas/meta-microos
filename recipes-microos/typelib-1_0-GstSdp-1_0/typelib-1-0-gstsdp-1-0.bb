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

RPM_NAME = "typelib-1_0-GstSdp-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "e55720632153db46cca6c0331879a9f7c950c83fdde96ba34d754b385f56cad59e32c227d5cf2b57d5d298ce6e06d66cd8ace814ef09eb75a26165051f99e12b"

RPROVIDES:${PN} += "typelib(GstSdp) typelib-1_0-GstSdp-1_0 typelib-1_0-GstSdp-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstsdp-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst)"

inherit rpm
