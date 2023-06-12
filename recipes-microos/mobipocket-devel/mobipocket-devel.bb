SUMMARY = "E-book plugin and library"
DESCRIPTION = "Mobipocket E-book plugin and library. \
 \
This package provides development files for mobipocket \
library"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "mobipocket-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "26d3655767b59d3065c88f52932921af8e2cd98cb630bee4fa6e6c553910132ca45fd70346c847dca72c14eee1096b94d3f39e73fb2cfc9d6099c851d4695e45"

RPROVIDES:${PN} += "cmake(QMobipocket) \
mobipocket-devel \
mobipocket-devel(aarch-64)"
RDEPENDS:${PN} += "libqmobipocket2"

inherit rpm
