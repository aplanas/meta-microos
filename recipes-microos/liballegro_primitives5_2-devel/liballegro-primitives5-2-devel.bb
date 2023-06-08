SUMMARY = "Development files for liballegro_primitives"
DESCRIPTION = "Development files needed to build applications which use liballegro_primitives."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.8.0"

RPM_NAME = "liballegro_primitives5_2-devel-5.2.8.0-1.3.aarch64.rpm"
RPM_HASH = "7730acc91c96075ad29f3e302d7579bc67156d6083e7ca4e18b07a5f7edd5c40d7cdf8535a01009f8bb633b032859e4e6691971b9938bf49b22f2f33e9dd2823"

RPROVIDES:${PN} += "liballegro_primitives5_2-devel liballegro_primitives5_2-devel(aarch-64) pkgconfig(allegro_primitives-5)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liballegro_primitives5_2 pkgconfig(allegro-5)"

inherit rpm
