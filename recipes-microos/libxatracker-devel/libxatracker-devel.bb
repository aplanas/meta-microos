SUMMARY = "Development files for the XA API"
DESCRIPTION = "This package contains the XA state tracker for gallium3D driver. \
It superseeds the Xorg state tracker and provides an infrastructure \
to accelerate Xorg 2D operations. It is currently used by vmwgfx \
video driver. \
 \
This package provides the development environment for compiling \
programs against the XA state tracker."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "libxatracker-devel-1.0.0-349.1.aarch64.rpm"
RPM_HASH = "d787d4446ef98d2015268afb5c312928cc76b7ed54eb5333769359547aa82414fc32e9b9192123495a9aacad1db3485481c027a57ada29b2d434044cc9be68f3"

RPROVIDES:${PN} += "libxatracker-devel libxatracker-devel(aarch-64) pkgconfig(xatracker)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libxatracker2"

inherit rpm
