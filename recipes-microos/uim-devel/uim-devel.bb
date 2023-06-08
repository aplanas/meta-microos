SUMMARY = "Development files for the UIM input method framework"
DESCRIPTION = "Include Files and Libraries mandatory for Development with uim."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & (BSD-3-Clause | LGPL-2.0-only)"

PV = "1.8.8"

RPM_NAME = "uim-devel-1.8.8-9.9.aarch64.rpm"
RPM_HASH = "fda3c19ada183ac16074b20ae2b5c501c9260a1fa777d5fd7476e74651bee4a9fd62baee703e00074c44702f2eb307102ba95fad917aea654fcf4629d7283d4c"

RPROVIDES:${PN} += "pkgconfig(uim) uim-devel uim-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config uim"

inherit rpm
