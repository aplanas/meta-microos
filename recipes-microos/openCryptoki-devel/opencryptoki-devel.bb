SUMMARY = "Development files for openCryptoki, a PKCS#11 implementation for IBM hardware"
DESCRIPTION = "The PKCS#11 version 2.01 API implemented for the IBM cryptographic \
cards. This package includes support for the IBM 4758 cryptographic \
co-processor (with the PKCS#11 firmware loaded) and the IBM eServer \
Cryptographic Accelerator (FC 4960 on pSeries)."
LICENSE = "CPL-1.0"

PV = "3.20.0"

RPM_NAME = "openCryptoki-devel-3.20.0-1.3.aarch64.rpm"
RPM_HASH = "7600853c7bd56dd0fe3869183d671731b68621732cbd13ec68dda61b93d7714911842044377cd039beee4c253cbdf713bf61628683f9e83d08eca8090196c059"

RPROVIDES:${PN} += "openCryptoki-devel openCryptoki-devel(aarch-64) pkgconfig(opencryptoki)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libopenssl-devel openldap2-devel trousers-devel"

inherit rpm
