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

RPM_NAME = "typelib-1_0-GstRtsp-1_0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "cd58528219c7d54d79b3a04bcb65e7cb4141b31fc8439111a4f337139f9702e7ae720b4b499a61525060c90418e5d970ad351ddfd7ea5450dd7580e4c0286b8f"

RPROVIDES:${PN} += "typelib(GstRtsp) typelib-1_0-GstRtsp-1_0 typelib-1_0-GstRtsp-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstrtsp-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gio) typelib(Gst) typelib(GstBase) typelib(GstSdp)"

inherit rpm
