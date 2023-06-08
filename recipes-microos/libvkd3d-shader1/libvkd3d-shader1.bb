SUMMARY = "Direct3D 12 to Vulkan translation shader library"
DESCRIPTION = "This is a Direct3D 12 to Vulkan shader library for use by e.g. Wine."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7"

RPM_NAME = "libvkd3d-shader1-1.7-1.1.aarch64.rpm"
RPM_HASH = "45fd6df516e78991a992a76625757aaa5ed61ebe1f3e7eada2b27ad9b0d3f7c23a60362f44209b0e6bf0351119551f5ab9d9f50ef088dc494edbbef911cddbd7"

RPROVIDES:${PN} += "libvkd3d-shader.so.1()(64bit) libvkd3d-shader.so.1(VKD3D_1_0)(64bit) libvkd3d-shader1 libvkd3d-shader1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSPIRV-Tools-shared-2023.2.so()(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
