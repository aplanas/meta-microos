SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstBadAudio-1_0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "b1f320ba11c1dadb7b6900350c559688582a35875dd41b39b9aafae18bfa7937ddbea95cd30dfaf7bf678651a6fb96f89b6456536d8235073a699f4892c5cb89"

RPROVIDES:${PN} += "typelib(GstBadAudio) typelib-1_0-GstBadAudio-1_0 typelib-1_0-GstBadAudio-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstbadaudio-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstAudio) typelib(GstBase)"

inherit rpm
