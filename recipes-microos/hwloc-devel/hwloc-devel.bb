SUMMARY = "Headers and shared development libraries for hwloc"
DESCRIPTION = "This package contains the headers and shared object symbolic links \
for the hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.0"

RPM_NAME = "hwloc-devel-2.9.0-2.3.aarch64.rpm"
RPM_HASH = "12907156400b12a24745bd0b3a7eaecdaf38f3fcba25690c7f7e006b1bbafc99ae4f3a946fb273479134a7f2de182584ba1d461f7a2cd170fe7a1dff4d01bbc5"

RPROVIDES:${PN} += "hwloc-devel hwloc-devel(aarch-64) libhwloc-devel pkgconfig(hwloc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libhwloc15 pkgconfig(libxml-2.0) pkgconfig(pciaccess)"

inherit rpm
