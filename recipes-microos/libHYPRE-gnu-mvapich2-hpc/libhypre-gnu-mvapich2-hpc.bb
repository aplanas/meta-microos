SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-mvapich2-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-mvapich2-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-mvapich2-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mvapich2-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-mvapich2-hpc-2.20.0-1.21.aarch64.rpm"
RPM_HASH = "9515177911bba0dac535c3789e553174936685e7201405482d71a98ecb8933e64a6da7c79343ac384a69fd9b087985ad23735c4f760fc905c4561e7f5ba3f112"

RPROVIDES:${PN} += "libHYPRE-gnu-mvapich2-hpc libHYPRE-gnu-mvapich2-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libHYPRE_2_20_0-gnu-mvapich2-hpc"

inherit rpm
