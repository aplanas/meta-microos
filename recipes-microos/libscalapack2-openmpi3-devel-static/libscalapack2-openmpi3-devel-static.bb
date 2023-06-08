SUMMARY = "Static libraries for ScaLAPACK (openmpi3)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi3-devel-static-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "6c46dd9897892e35a01a8c67f7608de22b79007a0f81b8de5015d56eb73842ca4bb2e94e6ce78ced1126f4acff74c22775f97285fb275aff299f6af2cf3c5f66"

RPROVIDES:${PN} += "libscalapack2-openmpi3-devel-static libscalapack2-openmpi3-devel-static(aarch-64) scalapack-openmpi3-devel-static"
RDEPENDS:${PN} += "libscalapack2-openmpi3-devel"

inherit rpm
