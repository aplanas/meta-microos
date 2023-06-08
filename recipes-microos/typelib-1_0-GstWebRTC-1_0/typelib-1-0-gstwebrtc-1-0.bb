SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstWebRTC-1_0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "36b4edeccdd24ef2fb8d25f84c4dd64bc0f16be068c982b38b40b25fd5bca614ebaf46d32f8de392002821903ce3222db94e149a349e0bdc8e234dffac18179d"

RPROVIDES:${PN} += "typelib(GstWebRTC) typelib-1_0-GstWebRTC-1_0 typelib-1_0-GstWebRTC-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstwebrtc-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstSdp)"

inherit rpm
