SUMMARY = "Dependency package for libgsl_2_7_1-gnu-hpc"
DESCRIPTION = "gsl: GNU Scientific Library \
The package libgsl-gnu-hpc provides the dependency to get binary package libgsl_2_7_1-gnu-hpc. \
When this package gets updated it installs the latest version of gsl_2_7_1-gnu-hpc."
LICENSE = "GPL-3.0-or-later"

PV = "2.7.1"

RPM_NAME = "libgsl-gnu-hpc-2.7.1-1.3.aarch64.rpm"
RPM_HASH = "1283574573c88c103ceb8ff33e7463ece8410bd0a79ab00fc00f298cff2f42e0c6c6c2bfa4e895d7ad2ae69a457e9b0c815e46315b5e7782dddcbc21c524a34f"

RPROVIDES:${PN} += "libgsl-gnu-hpc \
libgsl-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libgsl_2_7_1-gnu-hpc"

inherit rpm
