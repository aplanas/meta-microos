SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstPlayer-1_0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "9dd0d1a16bb851f0711a3677991638aad43b98ce2b871308ed1b8279aa8c634ea147f9e833526a5fc92333a9a0375e882eede5c57058bf9c4b725c7343e315a7"

RPROVIDES:${PN} += "typelib(GstPlayer) typelib-1_0-GstPlayer-1_0 typelib-1_0-GstPlayer-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstplayer-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstAudio) typelib(GstBase) typelib(GstPbutils) typelib(GstTag) typelib(GstVideo)"

inherit rpm
