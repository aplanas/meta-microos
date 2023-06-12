SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstVulkanXCB-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "c0a18f3169be42fc7c5a038194fbb7529fcfc02e3c35f68e41f443d12f824af948ef3e043829af0ec1cde2e15ec1003f3c30bc298bd4d3ccb8749dcb257961e0"

RPROVIDES:${PN} += "typelib(GstVulkanXCB) typelib-1_0-GstVulkanXCB-1_0 typelib-1_0-GstVulkanXCB-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstvulkan-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase) typelib(GstVideo) typelib(GstVulkan) typelib(Vulkan)"

inherit rpm
