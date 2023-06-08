SUMMARY = "Development files for libzmf"
DESCRIPTION = "libzmf is a library for generating Zoner documents. It is directly \
pluggable into import filters based on librevenge. \
 \
This package contains the libzmf development files."
LICENSE = "MPL-2.0"

PV = "0.0.2"

RPM_NAME = "libzmf-devel-0.0.2-1.43.aarch64.rpm"
RPM_HASH = "e19360230c85bfbe4bd0ff879cda2823a178bec88fc57741706e51bbb50c76add14680135b3ae648248a8f6385532244debff37ec366e1de6f80e108ce4b63f3"

RPROVIDES:${PN} += "libzmf-devel libzmf-devel(aarch-64) pkgconfig(libzmf-0.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libzmf-0_0-0 pkgconfig(librevenge-0.0)"

inherit rpm
