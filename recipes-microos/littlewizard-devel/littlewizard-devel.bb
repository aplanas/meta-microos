SUMMARY = "Development headers and files for littlewizard"
DESCRIPTION = "The littlewizard-devel package contains libraries and header files for \
littlewizard developing."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.2"

RPM_NAME = "littlewizard-devel-1.2.2-17.16.aarch64.rpm"
RPM_HASH = "6bed501a88c8dcfec1277f87579b148735f31eb4292d3a497b102f8d212041817740d83089865403237dfedc10af4f419f0fc33444fc256fbc6cfd7fa0b766db"

RPROVIDES:${PN} += "littlewizard-devel littlewizard-devel(aarch-64)"
RDEPENDS:${PN} += "littlewizard"

inherit rpm
