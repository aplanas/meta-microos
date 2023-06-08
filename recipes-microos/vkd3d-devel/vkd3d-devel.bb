SUMMARY = "Development headers for the Direct3D 12 to Vulkan translation library"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation library for use by e.g. Wine. \
 \
These are its development libraries and headers."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7"

RPM_NAME = "vkd3d-devel-1.7-1.1.aarch64.rpm"
RPM_HASH = "c8e3d53b798e3b36081f44e18af7aed57181ffc9f1bfaafd9e35e18e54620e01633d7a5243209d1504c857fc9c290b878dec8fde0fc8042c8b73874307a3b170"

RPROVIDES:${PN} += "pkgconfig(libvkd3d) pkgconfig(libvkd3d-shader) pkgconfig(libvkd3d-utils) vkd3d-devel vkd3d-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) libvkd3d-shader.so.1()(64bit) libvkd3d-shader.so.1(VKD3D_1_0)(64bit) libvkd3d-utils1 libvkd3d1"

inherit rpm
