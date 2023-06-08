SUMMARY = "Header files for the Osmocom RUA library"
DESCRIPTION = "Osmocom code for the RANAP User Adaption signalling. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-rua."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "libosmo-rua-devel-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "3bc1785493ea6a751f0b7e49a32d944103750766a34fd780ee06e4148fc9e8d2b5e1223b02c9c8c15ce327a6f74e1afbaf18910219e14aee6c6f421fbbca9f6c"

RPROVIDES:${PN} += "libosmo-rua-devel libosmo-rua-devel(aarch-64) pkgconfig(libosmo-rua)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-rua0"

inherit rpm
