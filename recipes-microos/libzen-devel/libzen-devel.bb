SUMMARY = "Include files to develop for libzen"
DESCRIPTION = "Include files and mandatory libraries to develop \
for libzen."
LICENSE = "Zlib"

PV = "0.4.41"

RPM_NAME = "libzen-devel-0.4.41-1.1.aarch64.rpm"
RPM_HASH = "104e78db61baf7a671ee6e8f4bac2cbf0d248bfa82f30e6974da5b4c54c2f253da334fc34301bbe6f1d90afd11c025ebb4576a2746340324ce3bb879ee745570"

RPROVIDES:${PN} += "libzen-devel \
libzen-devel(aarch-64) \
pkgconfig(libzen)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libzen0"

inherit rpm
