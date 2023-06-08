SUMMARY = "Vulkan C and C++ API header files"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media. \
 \
This package contains the development headers for packages wanting \
to make use of Vulkan."
LICENSE = "Apache-2.0"

PV = "1.3.247"

RPM_NAME = "vulkan-headers-1.3.247-1.1.noarch.rpm"
RPM_HASH = "aa2629f9923d687ef82bf1f88eb3cbc53e1a4f009ff9722396ea8d60f3932eadd8e86e8297225c7e1fc21d9fdc2545fa58f082bafa82cb42ab18649ea63409fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cmake(VulkanHeaders) vulkan-headers"
RDEPENDS:${PN} += "/usr/bin/python3 pkgconfig(wayland-client) pkgconfig(x11) pkgconfig(xcb) pkgconfig(xrandr)"

inherit rpm
