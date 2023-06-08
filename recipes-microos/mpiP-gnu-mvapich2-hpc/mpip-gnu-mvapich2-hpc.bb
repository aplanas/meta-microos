SUMMARY = "Dependency package for mpiP_3_5-gnu-mvapich2-hpc"
DESCRIPTION = "mpiP: A profiling library for MPI applications \
The package mpiP-gnu-mvapich2-hpc provides the dependency to get binary package mpiP_3_5-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of mpiP_3_5-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP-gnu-mvapich2-hpc-3.5-3.3.noarch.rpm"
RPM_HASH = "6f12acdb7ff638b55863c3fb160533190c86fec625929c14299732216fdcb197e20e05002c367a0024895913d46e69dec5144d97aab73b3f9151801052d243bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mpiP-gnu-mvapich2-hpc"
RDEPENDS:${PN} += "/bin/sh mpiP_3_5-gnu-mvapich2-hpc"

inherit rpm
