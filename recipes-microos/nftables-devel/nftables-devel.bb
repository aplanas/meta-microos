SUMMARY = "Development files for the nftables command line interface"
DESCRIPTION = "libnftables is the nftables command line interface placed into a \
library. \
 \
This package contains the header files for the library."
LICENSE = "GPL-2.0-only"

PV = "1.0.7"

RPM_NAME = "nftables-devel-1.0.7-1.3.aarch64.rpm"
RPM_HASH = "2715114659175b6755df937bb19a67ee857763f5326c70ef6e8ae5ce74fe4e0b3ba31184abfcf2f99dd43f6a49bb31bf636cf97900f6adb9844d8b2e58e21a00"

RPROVIDES:${PN} += "nftables-devel \
nftables-devel(aarch-64) \
pkgconfig(libnftables)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnftables1"

inherit rpm
