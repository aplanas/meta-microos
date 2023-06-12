SUMMARY = "Development package for kosmindoormap"
DESCRIPTION = "This package contains development files for the KOSM and KOSMIndoorMap libraries."
LICENSE = "LGPL-2.0-or-later & CC0-1.0"

PV = "23.04.1"

RPM_NAME = "kosmindoormap-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "277e481e14cd1df2e65489b4890df926657235063d85b66eef51351e817aaa61ce9e0df5e880402920926446d0efb3a0b6ac748986ad452593c9932c2792a0ec"

RPROVIDES:${PN} += "cmake(KOSMIndoorMap) kosmindoormap-devel kosmindoormap-devel(aarch-64)"
RDEPENDS:${PN} += "libKOSM1 libKOSMIndoorMap1"

inherit rpm
