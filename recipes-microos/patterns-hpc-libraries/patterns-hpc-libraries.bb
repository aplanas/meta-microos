SUMMARY = "HPC Modularized Libraries"
DESCRIPTION = "This package provides all the modularized libraries so that they can be used in an HPC environment. These libraries allow to install several MPI flavors in parallel. \
In order to use these libraries one needs to load them via the module command first."
LICENSE = "MIT"

PV = "20190218"

RPM_NAME = "patterns-hpc-libraries-20190218-7.1.aarch64.rpm"
RPM_HASH = "09c0d8e67ff669209a83611564c9c6154e3f0681653de9adb9aa4cd5a3d02debf9f0619232a5ab6f4aef2c621ab988d9d24542374d44b635c0f2787ce8870fde"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-hpc-libraries patterns-hpc-libraries(aarch-64)"
RDEPENDS:${PN} += "iputils lua-lmod mpich-gnu-hpc mpich-ofi-gnu-hpc mvapich2-gnu-hpc openmpi4-gnu-hpc pattern()"

inherit rpm
