SUMMARY = "Library and Include Files of the PCI utilities"
DESCRIPTION = "This package contains the files that are necessary for software \
development using the PCI utilities."
LICENSE = "GPL-2.0-or-later"

PV = "3.10.0"

RPM_NAME = "pciutils-devel-3.10.0-1.1.aarch64.rpm"
RPM_HASH = "c320115a0202ecc869dffe2e8b7303430601336e902215edf061257b4c218d523abf7deea9c2de451acf3f5d717060376b06adb1314603c45672865ca2b0a537"

RPROVIDES:${PN} += "pciutils-devel \
pciutils-devel(aarch-64) \
pkgconfig(libpci)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpci3"

inherit rpm
