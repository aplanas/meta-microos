SUMMARY = "Development files for libperseus-sdr"
DESCRIPTION = "Libraries and header files for developing applications that want to \
make use of libperseus-sdr."
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "libperseus-sdr-devel-0.8.1-1.22.aarch64.rpm"
RPM_HASH = "80bba7b78019e0290c51657bf3c4d75217c2f057822a5cb9c1f96eaa30e2b9f2925d9217f59b29775810c582b30b7a6ccf5e1e3cc1f6ecf2c5a23610c66eca37"

RPROVIDES:${PN} += "libperseus-sdr-devel libperseus-sdr-devel(aarch-64)"
RDEPENDS:${PN} += "libperseus-sdr0"

inherit rpm
