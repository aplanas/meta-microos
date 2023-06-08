SUMMARY = "Dependency package for mumps_5_3_5-gnu-mvapich2-hpc-examples"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-mvapich2-hpc-examples provides the dependency to get binary package mumps_5_3_5-gnu-mvapich2-hpc-examples. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-mvapich2-hpc-examples-5.3.5-3.3.noarch.rpm"
RPM_HASH = "05ad1ec5115c6fab104001d8eb3d77b6d7e35cf4930a3c59cf3a26bc4d2b75d47c3335793c79b2e6963370b59feac195c48575a8cf341fa0a690a36b88bb6c75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-mvapich2-hpc-examples"
RDEPENDS:${PN} += "/bin/sh mumps_5_3_5-gnu-mvapich2-hpc-examples"

inherit rpm
