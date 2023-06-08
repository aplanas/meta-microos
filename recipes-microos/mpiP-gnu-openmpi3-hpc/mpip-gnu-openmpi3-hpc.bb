SUMMARY = "Dependency package for mpiP_3_5-gnu-openmpi3-hpc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-openmpi3-hpc provides the dependency to get binary package mpiP_3_5-gnu-openmpi3-hpc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-openmpi3-hpc-3.5-3.2.noarch.rpm"
RPM_HASH = "652d1d3539c168ed71f4a9768b2cd274ed9332f932a9b0807db020e6a16402deb2710bb691c05ea11912249c8abed9e82419fe155d272984679a253a51cc2d3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-openmpi3-hpc"
RDEPENDS:${PN} += "/bin/sh mpiP_3_5-gnu-openmpi3-hpc"

inherit rpm
