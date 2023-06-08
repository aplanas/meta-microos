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

RPM_NAME = "typelib-1_0-GstAudio-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "bcfaf80b55850470431e4a6dc60c57b7908d57af8621c869ce8ee0532857c290fa38eaae91c9827651d002fd93bb71a987557cd9c1e1b8d3449586427efc94cb"

RPROVIDES:${PN} += "typelib(GstAudio) typelib-1_0-GstAudio-1_0 typelib-1_0-GstAudio-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstaudio-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase)"

inherit rpm
