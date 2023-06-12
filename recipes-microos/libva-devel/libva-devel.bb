SUMMARY = "Development files for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
 \
 \
 \
This package provides the development environment for libva packages."
LICENSE = "MIT"

PV = "2.18.0"

RPM_NAME = "libva-devel-2.18.0-2.1.aarch64.rpm"
RPM_HASH = "400773b651d4d0cb66139f10139968c889ba14f2d2028f483960d07f37df46ea20a9f47be97bf3151a4c89aea0e09beddac6c26aeefda15dbfd8c696abe5c157"

RPROVIDES:${PN} += "libva-devel \
libva-devel(aarch-64) \
pkgconfig(libva) \
pkgconfig(libva-drm) \
pkgconfig(libva-wayland) \
pkgconfig(libva-x11)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libva-drm2 \
libva-wayland2 \
libva-x11-2 \
libva2 \
pkgconfig(libdrm) \
pkgconfig(libva) \
pkgconfig(wayland-client) \
pkgconfig(x11) \
pkgconfig(xfixes)"

inherit rpm
