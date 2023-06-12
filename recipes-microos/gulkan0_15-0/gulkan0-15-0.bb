SUMMARY = "A GLib library for Vulkan abstraction"
DESCRIPTION = "A GLib library for Vulkan abstraction. It provides classes for handling Vulkan instances, devices, shaders and initialize textures GDK Pixbufs, Cairo surfaces and DMA buffers."
LICENSE = "MIT"

PV = "0.15.2"

RPM_NAME = "gulkan0_15-0-0.15.2-1.4.aarch64.rpm"
RPM_HASH = "03b5589e5d5e8908e1da414887df41b45dd062d371bd910c3b9c2c50bbe400fafca2dbf4b0cd82730b86667cf161c807f635b147d7ba61dedf76e851a4a589ff"

RPROVIDES:${PN} += "gulkan0_15-0 \
gulkan0_15-0(aarch-64) \
libgulkan-0.15.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglfw.so.3()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgraphene-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0()(64bit) \
libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) \
libshaderc_shared.so.1()(64bit) \
libvulkan.so.1()(64bit)"

inherit rpm
