SUMMARY = "Dependency package for libmumps_5_3_5-gnu-openmpi2-hpc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package libmumps-gnu-openmpi2-hpc provides the dependency to get binary package libmumps_5_3_5-gnu-openmpi2-hpc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-openmpi2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-gnu-openmpi2-hpc-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "40684792ce552d2d026e074df1ec54bd8538bdf66bc3af1b51ed46127036bcb9c07079143c3dcfd197f2f4553553ab843c4c7d178c5279111dc8ed31bdf609bc"

RPROVIDES:${PN} += "libmumps-gnu-openmpi2-hpc \
libmumps-gnu-openmpi2-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libmumps_5_3_5-gnu-openmpi2-hpc"

inherit rpm
