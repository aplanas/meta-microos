SUMMARY = "Dependency package for libmumps_5_3_5-gnu-mpich-hpc"
DESCRIPTION = "mumps: A MUltifrontal Massively Parallel Sparse direct Solver \
The package libmumps-gnu-mpich-hpc provides the dependency to get binary package libmumps_5_3_5-gnu-mpich-hpc. \
When this package gets updated it installs the latest version of mumps_5_3_5-gnu-mpich-hpc."
LICENSE = "CECILL-C"

PV = "5.3.5"

RPM_NAME = "libmumps-gnu-mpich-hpc-5.3.5-3.3.aarch64.rpm"
RPM_HASH = "763414778e847cc9d3af484d4adb75cb5405636f3cdcb53d943e6e5eb904bd800917e9d397d001fce63aa45675b342e3184d26626c53534b5e6f4178e19faf2c"

RPROVIDES:${PN} += "libmumps-gnu-mpich-hpc \
libmumps-gnu-mpich-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libmumps_5_3_5-gnu-mpich-hpc"

inherit rpm
