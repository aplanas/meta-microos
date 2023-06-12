SUMMARY = "Development files for libzmf"
DESCRIPTION = "libzmf is a library for generating Zoner documents. It is directly \
pluggable into import filters based on librevenge. \
 \
This package contains the libzmf development files."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libzmf-devel-0.0.2-1.44.aarch64.rpm"
RPM_HASH = "a68878efae5e92a09dc7a5a03325360020a6873054ec33cdefc97be55644ceb7ea996f766b3d771049fc9cc967d9e4d8f9593841b413df1866e360d8e5093695"

RPROVIDES:${PN} += "libzmf-devel libzmf-devel(aarch-64) pkgconfig(libzmf-0.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libzmf-0_0-0 pkgconfig(librevenge-0.0)"

inherit rpm
