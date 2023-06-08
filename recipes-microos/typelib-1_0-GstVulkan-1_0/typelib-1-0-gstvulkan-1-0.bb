SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "typelib-1_0-GstVulkan-1_0-1.22.2-3.1.aarch64.rpm"
RPM_HASH = "aea199dc3075236f035114342e01d9c510a2946983044fe7fcce6a25a198ce5ea758674bdf9bb533d5807b6f37eb82b9886192716c6683325a7ff3cc5b1eafa6"

RPROVIDES:${PN} += "typelib(GstVulkan) typelib-1_0-GstVulkan-1_0 typelib-1_0-GstVulkan-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstvulkan-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase) typelib(GstVideo) typelib(Vulkan)"

inherit rpm
