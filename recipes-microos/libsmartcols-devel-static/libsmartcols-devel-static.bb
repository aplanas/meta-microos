SUMMARY = "Development files for libsmartcols"
DESCRIPTION = "Files to develop applications using the libsmartcols library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.38.1"

RPM_NAME = "libsmartcols-devel-static-2.38.1-12.1.aarch64.rpm"
RPM_HASH = "bd22923800c33e462e29d62df06281750862ca292b6c481faf890253d0c66da861fe31bfa318f6a6c2d1517307ad2c78fa1f8f8b9ea265c073dfcb3706e22f9d"

RPROVIDES:${PN} += "libsmartcols-devel-static libsmartcols-devel-static(aarch-64)"
RDEPENDS:${PN} += "libsmartcols-devel"

inherit rpm
