SUMMARY = "Header files for libepub library"
DESCRIPTION = "Header files for the libepub library"
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "libepub-devel-0.2.2-7.1.aarch64.rpm"
RPM_HASH = "d3ff02da5094c8db985b38c60aa1bbad1a890787884e37bbf789ba2005d02def9544fa3f3bddce7b2cc1411db35d50b357d9f3f2740b55015d2e5b8be1dead66"

RPROVIDES:${PN} += "libepub-devel libepub-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libepub0"

inherit rpm
