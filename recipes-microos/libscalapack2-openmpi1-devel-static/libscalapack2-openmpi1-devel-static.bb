SUMMARY = "Static libraries for ScaLAPACK (openmpi1)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-openmpi1-devel-static-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "b8327378e69f3b0f3bec3b433b6aae59777d5c090bc11c0e1537ea69e1b26625b59fd5432dc6d685e1943f5c791ef0bc720de29f2189306d5c0795c5e27b1674"

RPROVIDES:${PN} += "libscalapack2-openmpi1-devel-static libscalapack2-openmpi1-devel-static(aarch-64) scalapack-openmpi1-devel-static"
RDEPENDS:${PN} += "libscalapack2-openmpi1-devel"

inherit rpm
