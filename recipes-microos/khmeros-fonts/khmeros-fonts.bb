SUMMARY = "Fonts for the Khmer Language of Cambodia"
DESCRIPTION = "This package contains fonts for the Khmer language of Cambodia."
LICENSE = "LGPL-2.1+"

PV = "5.0"

RPM_NAME = "khmeros-fonts-5.0-118.17.noarch.rpm"
RPM_HASH = "d4000d8234a768c13e612e34dec9aed4d3288e4fd35e5824f9630036fac4fcd1dc4f2ade63f5a7585b17abe87fbbea9b488dfc1075a82557efadfc7428cdbe3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "KhmerOS-fonts khmeros-fonts locale(km) scalable-font-km"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
