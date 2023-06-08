SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstMpegts-1_0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "067d006981774e07fc29cbd28d989f8017202b9f28579afedf60e44a11194b4c1ec76a914b9d6776ad932b5b5b9b358850018ac63c3e5e00b0ac84982f66fe2b"

RPROVIDES:${PN} += "typelib(GstMpegts) typelib-1_0-GstMpegts-1_0 typelib-1_0-GstMpegts-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstmpegts-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst)"

inherit rpm
