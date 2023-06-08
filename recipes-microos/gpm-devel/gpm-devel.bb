SUMMARY = "Development files for gpm (Console Mouse Support)"
DESCRIPTION = "Development files for the gpm (general purpose mouse) package."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.7"

RPM_NAME = "gpm-devel-1.20.7-19.14.aarch64.rpm"
RPM_HASH = "531556c1bf37159dcad5ed38d8fa8e574c9398785ecf83b37620843b97044972379d3620b08ddc1ec1b5ed21e2da3a0896211fa61452cbcbff89fc6c93329120"

RPROVIDES:${PN} += "gpm-devel gpm-devel(aarch-64)"
RDEPENDS:${PN} += "libgpm2"

inherit rpm
