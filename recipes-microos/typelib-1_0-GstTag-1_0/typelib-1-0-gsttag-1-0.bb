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

RPM_NAME = "typelib-1_0-GstTag-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "23722647db4af9ff6c3793459c487285fefc915077a859bb0befd675bef074df54f57ddf75fda3aca5647604dab35823c8bc24f64aeac69b26fd029dba4d2c5b"

RPROVIDES:${PN} += "typelib(GstTag) typelib-1_0-GstTag-1_0 typelib-1_0-GstTag-1_0(aarch-64)"
RDEPENDS:${PN} += "libgsttag-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase)"

inherit rpm
