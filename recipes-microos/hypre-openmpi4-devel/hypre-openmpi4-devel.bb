SUMMARY = "Headers and library links for libHYPRE2_20_0-openmpi4"
DESCRIPTION = "HYPRE headers and libraries files needed for development \
This package contains development files of the openmpi4 version of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-openmpi4-devel-2.20.0-1.9.aarch64.rpm"
RPM_HASH = "f7990b24592737424a10f31de5b10cda8e8ebee4c157251a946a5bef6018554afad3de9dc409e8643adaf4973a9a60d4f93859672587ff2e251dd3ea13712c22"

RPROVIDES:${PN} += "hypre-openmpi4-devel hypre-openmpi4-devel(aarch-64)"
RDEPENDS:${PN} += "lapack-devel libHYPRE2_20_0-openmpi4 superlu-devel"

inherit rpm
