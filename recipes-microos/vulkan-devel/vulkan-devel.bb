SUMMARY = "Vulkan development package"
DESCRIPTION = "Vulkan is a 3D graphics and compute API providing cross-platform \
access to modern GPUs with low overhead and targeting realtime \
graphics applications such as games and interactive media. \
 \
This subpackage contains the development headers for packages wanting \
to make use of Vulkan."
LICENSE = "Apache-2.0"

PV = "1.3.247"

RPM_NAME = "vulkan-devel-1.3.247-1.1.aarch64.rpm"
RPM_HASH = "47ad294b960b4dc9eff0623719bf18790bdf91612fb492ef9750b29047a30f91e948e654f883f6c744676d54e1677aa1bf5ec5b178529843929ebd1f73fe7f32"

RPROVIDES:${PN} += "pkgconfig(vulkan) vulkan-devel vulkan-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libvulkan1 vulkan-headers"

inherit rpm
