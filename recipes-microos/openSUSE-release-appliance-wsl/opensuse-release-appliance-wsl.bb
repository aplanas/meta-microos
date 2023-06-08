SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230509"

RPM_NAME = "openSUSE-release-appliance-wsl-20230509-1651.1.aarch64.rpm"
RPM_HASH = "3c526ade0cbea9ebbb7bb141c309a45cb07e527185e1c670708aca367dd49201daba3c6228cb6f9fdc341aafd834a9566353b11fccdea9e7a01949f1b87caa93"

RPROVIDES:${PN} += "flavor(appliance-wsl) openSUSE-release-appliance-wsl openSUSE-release-appliance-wsl(aarch-64) product_flavor() product_flavor(openSUSE)"
RDEPENDS:${PN} += ""

inherit rpm
