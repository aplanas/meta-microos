SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstPlayer-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "2aa8336a0f757be663eea1cb8f70fdbe59f4a7df9ca3f6249ce4ba41de7d1d0088c68faacf028473d89460a61c0e7238db60af8633b711bb64122403cf13f5f3"

RPROVIDES:${PN} += "typelib(GstPlayer) typelib-1_0-GstPlayer-1_0 typelib-1_0-GstPlayer-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstplayer-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstAudio) typelib(GstBase) typelib(GstPbutils) typelib(GstTag) typelib(GstVideo)"

inherit rpm
