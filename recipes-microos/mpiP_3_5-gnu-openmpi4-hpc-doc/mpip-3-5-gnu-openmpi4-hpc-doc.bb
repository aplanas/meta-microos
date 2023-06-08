SUMMARY = "Documentation for the mpiP profiling library"
DESCRIPTION = "mpiP is a profiling library for MPI applications. \
 \
This contains the documentation."
LICENSE = "BSD-3-Clause"

PV = "3.5"

RPM_NAME = "mpiP_3_5-gnu-openmpi4-hpc-doc-3.5-3.2.aarch64.rpm"
RPM_HASH = "96e4c50c36da6782bfd6b7a57f675604fa05c58c8720e89f1bf4a8823ff31778f4d530aea0317628d42158c29d8f2a643099aa7eef411cc3693f0fa19ca790b4"

RPROVIDES:${PN} += "mpiP_3_5-gnu-openmpi4-hpc-doc mpiP_3_5-gnu-openmpi4-hpc-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
