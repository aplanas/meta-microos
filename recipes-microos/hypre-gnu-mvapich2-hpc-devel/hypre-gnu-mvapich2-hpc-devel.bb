SUMMARY = "Dependency package for hypre_2_20_0-gnu-mvapich2-hpc-devel"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package hypre-gnu-mvapich2-hpc-devel provides the dependency to get binary package hypre_2_20_0-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mvapich2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "hypre-gnu-mvapich2-hpc-devel-2.20.0-1.21.noarch.rpm"
RPM_HASH = "d625074b7999fb3b7a9162bfb802ef1bcc4f6d116db076de5649bae9279dddf713582c18286693ff62509e2b3759faf2c0ea02891a4bd3e8badfa351a48b6985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hypre-gnu-mvapich2-hpc-devel"
RDEPENDS:${PN} += "/bin/sh hypre_2_20_0-gnu-mvapich2-hpc-devel"

inherit rpm
