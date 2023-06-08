SUMMARY = "Direct3D 12 to Vulkan translation library"
DESCRIPTION = "This is a Direct3D 12 to Vulkan translation library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7"

RPM_NAME = "libvkd3d1-1.7-1.1.aarch64.rpm"
RPM_HASH = "fc7b3359ea066419f18e27e9f07534f9dbe046ed991c2b5907a980f0e7f10e948e1fd253b92dc1ea6540791c17935b940f8fba79eebe7bd386259e538df38d95"

RPROVIDES:${PN} += "libvkd3d.so.1()(64bit) libvkd3d.so.1(VKD3D_1_0)(64bit) libvkd3d1 libvkd3d1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libvkd3d-shader.so.1()(64bit) libvkd3d-shader.so.1(VKD3D_1_0)(64bit)"

inherit rpm
