SUMMARY = "GStreamer Streaming-Media Framework Plug-Ins -- Introspection bindings"
DESCRIPTION = "GStreamer is a streaming media framework based on graphs of filters \
that operate on media data. Applications using this library can do \
anything media-related, from real-time sound processing to playing \
videos. Its plug-in-based architecture means that new data types or \
processing capabilities can be added simply by installing new plug-ins."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.3"

RPM_NAME = "typelib-1_0-GstVulkanWayland-1_0-1.22.3-1.1.aarch64.rpm"
RPM_HASH = "9d72b02ce39443d1b0132281cffc929f8d860b85d7788dc45f2e9c6528af8c115b0d2959569f88d2b2b4cd8014ffa511da4c0d7875ebce3b83669d393fc3af67"

RPROVIDES:${PN} += "typelib(GstVulkanWayland) typelib-1_0-GstVulkanWayland-1_0 typelib-1_0-GstVulkanWayland-1_0(aarch-64)"
RDEPENDS:${PN} += "libgstvulkan-1.0.so.0()(64bit) typelib(GLib) typelib(GModule) typelib(GObject) typelib(Gst) typelib(GstBase) typelib(GstVideo) typelib(GstVulkan) typelib(Vulkan)"

inherit rpm
