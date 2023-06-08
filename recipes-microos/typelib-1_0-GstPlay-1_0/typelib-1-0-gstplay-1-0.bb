SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstPlay-1_0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "349a927bbb6ed9b84d286628b698ed35bb7f28b847cd6871567ab74bb5b2d4e6381d12bacf80de470f2557efc4d3bfc173a3ade1a6ee5fdc06ecf79c77bf3b87"

RPROVIDES:${PN} += "typelib(GstPlay) typelib-1_0-GstPlay-1_0 typelib-1_0-GstPlay-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstplay-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstAudio) typelib(GstBase) typelib(GstPbutils) typelib(GstTag) typelib(GstVideo)"

inherit rpm
