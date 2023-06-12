SUMMARY = "Vulkan development package"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media. \
 \
This subpackage contains the development headers for packages wanting \
to make use of Vulkan."
LICENSE = "Apache-2.0"

PV = "1.3.250.0"

RPM_NAME = "vulkan-devel-1.3.250.0-1.1.aarch64.rpm"
RPM_HASH = "e731942085126d3b4e2711c8808187c3825603daabc085f499dc210438d9e52f1bac1ef0f05ae0f56c7ec4f4e73e7b9b43ce0c9823b86257e1f0bc3d284f0670"

RPROVIDES:${PN} += "pkgconfig(vulkan) \
vulkan-devel \
vulkan-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvulkan1 \
vulkan-headers"

inherit rpm
