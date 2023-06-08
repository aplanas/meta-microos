SUMMARY = "Development files for the Osmocom sigtran library"
DESCRIPTION = "Osmocom implementation of (parts of) SIGTRAN. \
 \
This subpackage contains the development files for the Osmocom \
SIGTRAN library."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "libosmo-sigtran-devel-1.6.0-1.4.aarch64.rpm"
RPM_HASH = "ff46f9ed8df46d981d093ec08205c27fe3cbde5fb700d36d335ea4ab5bbee550247eda6b79aabe45d09ec14a2dc1d3c3fdd41faa01a62403eeeabaa18c1ff7f6"

RPROVIDES:${PN} += "libosmo-sigtran-devel libosmo-sigtran-devel(aarch-64) pkgconfig(libosmo-sigtran)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-sigtran7"

inherit rpm
