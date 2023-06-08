SUMMARY = "E-book plugin and library"
DESCRIPTION = "Mobipocket E-book plugin and library. \
 \
This package provides development files for mobipocket \
library"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "mobipocket-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "e427468a33ad57e77123815fb7b1e9fa966b1c572960894dd07f59c112ecd1de0fb4498a6320b24d8d8111196622984c8b43187999e8f51032a3f31b5f17f53c"

RPROVIDES:${PN} += "cmake(QMobipocket) mobipocket-devel mobipocket-devel(aarch-64)"
RDEPENDS:${PN} += "libqmobipocket2"

inherit rpm
