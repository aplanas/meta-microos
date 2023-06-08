SUMMARY = "Direct3D 12 to Vulkan translation library utilities"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation utilities library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7"

RPM_NAME = "libvkd3d-utils1-1.7-1.1.aarch64.rpm"
RPM_HASH = "56f8f2f1032596bef146257c22d915be0a014c210e662f159b72a7383bc3af0c3925192c851882494a8fa385f751c1b47e1bf4ec239b0b44add8606c8e750883"

RPROVIDES:${PN} += "libvkd3d-utils.so.1()(64bit) libvkd3d-utils.so.1(VKD3D_1_0)(64bit) libvkd3d-utils1 libvkd3d-utils1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libvkd3d-shader.so.1()(64bit) libvkd3d-shader.so.1(VKD3D_1_0)(64bit) libvkd3d.so.1()(64bit) libvkd3d.so.1(VKD3D_1_0)(64bit)"

inherit rpm
