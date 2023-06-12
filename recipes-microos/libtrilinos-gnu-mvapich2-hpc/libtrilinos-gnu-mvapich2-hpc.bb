SUMMARY = "Dependency package for libtrilinos_14_0_0-gnu-mvapich2-hpc"
DESCRIPTION = "trilinos: A collection of libraries of numerical algorithms \
The package libtrilinos-gnu-mvapich2-hpc provides the dependency to get binary package libtrilinos_14_0_0-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of trilinos_14_0_0-gnu-mvapich2-hpc."
LICENSE = "LGPL-2.0-only"

PV = "14.0.0"

RPM_NAME = "libtrilinos-gnu-mvapich2-hpc-14.0.0-1.1.aarch64.rpm"
RPM_HASH = "cfccce9c5ff404d2a05512e1da5852470328b3049f24321e6a34445fcfe6f5f47d71972960ef37d7cd3ac169270a3f80d1bee26612d7b7f33eb3c839d74d1fe6"

RPROVIDES:${PN} += "libtrilinos-gnu-mvapich2-hpc \
libtrilinos-gnu-mvapich2-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libtrilinos_14_0_0-gnu-mvapich2-hpc"

inherit rpm
