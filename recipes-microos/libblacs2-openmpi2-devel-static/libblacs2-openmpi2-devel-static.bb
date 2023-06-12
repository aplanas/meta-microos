SUMMARY = "Development libraries for BLACS (openmpi2)"
DESCRIPTION = "This package contains static libraries for BLACS, compiled against openmpi2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi2-devel-static-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "a07ce2dd250121a3443ae30409dc110fa8505b0930be51f0791c3760bbce63e7521acc8e93c4e2a33fcc61f334700863b58b2c7bb260fdb6bc63b3d3d0baa55a"

RPROVIDES:${PN} += "libblacs2-openmpi2-devel-static \
libblacs2-openmpi2-devel-static(aarch-64)"
RDEPENDS:${PN} += "libblacs2-openmpi2-devel"

inherit rpm
