SUMMARY = "Dependency package for libHYPRE_2_20_0-gnu-mpich-hpc"
DESCRIPTION = "hypre: Scalable algorithms for solving linear systems of equations \
The package libHYPRE-gnu-mpich-hpc provides the dependency to get binary package libHYPRE_2_20_0-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of hypre_2_20_0-gnu-mpich-hpc."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE-gnu-mpich-hpc-2.20.0-1.22.aarch64.rpm"
RPM_HASH = "7aeada75292f8402d22be95358c306588e98c739bc5bbc86602b7fb218991fb49d38715dc091dbf114e5b7239579adb1371b4b2dc6f5ecbc4370473cc60a4e94"

RPROVIDES:${PN} += "libHYPRE-gnu-mpich-hpc libHYPRE-gnu-mpich-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libHYPRE_2_20_0-gnu-mpich-hpc"

inherit rpm
