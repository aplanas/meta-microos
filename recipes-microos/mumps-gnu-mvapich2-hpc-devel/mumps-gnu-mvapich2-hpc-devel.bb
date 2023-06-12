SUMMARY = "Dependency package for mumps_5_3_5-gnu-mvapich2-hpc-devel"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package mumps-gnu-mvapich2-hpc-devel provides the dependency to get binary package mumps_5_3_5-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mvapich2-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "mumps-gnu-mvapich2-hpc-devel-5.3.5-3.3.noarch.rpm"
RPM_HASH = "1fa46854891d1a0fdcfe5dbd29c90238d659d2195b8bb53911d7cf62c3d00ec5d35931298fd070b4964a988fc0f7b8ee05aedd1517ffcbdf08f8711288b394c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mumps-gnu-mvapich2-hpc-devel"
RDEPENDS:${PN} += "/bin/sh \
mumps_5_3_5-gnu-mvapich2-hpc-devel"

inherit rpm
