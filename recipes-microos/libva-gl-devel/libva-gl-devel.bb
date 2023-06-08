SUMMARY = "Development files for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
 \
This package provides the development environment for libva gl packages."
LICENSE = "MIT"

PV = "2.18.0"

RPM_NAME = "libva-gl-devel-2.18.0-2.1.aarch64.rpm"
RPM_HASH = "9e9974b4c56fa3373d65bd269afe06dea246830e6d2aad4a72dd27ff354bb3cdb4a155b34e6d749c275d90e42c5fb2e1494e6939c597022f056e2899ee78747d"

RPROVIDES:${PN} += "libva-gl-devel libva-gl-devel(aarch-64) pkgconfig(libva-glx)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libva-glx2 pkgconfig(gl) pkgconfig(libva)"

inherit rpm
