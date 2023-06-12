SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi4-hpc-devel"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi4-hpc-devel provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi4-hpc-devel. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi4-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi4-hpc-devel-2.1.0-9.19.aarch64.rpm"
RPM_HASH = "fee3ec2a95866ec8804c7beea07e8cf15f971a68aa17bce2df51989dc108a73d53b4a1f6ef2f3aeacab86f1f4ff22d751985097de054c8b5c6c60da76218ce5b"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi4-hpc-devel \
libscalapack2-gnu-openmpi4-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "libscalapack2_2_1_0-gnu-openmpi4-hpc-devel"

inherit rpm
