SUMMARY = "Development files for python39-mpi4py"
DESCRIPTION = "Development libraries and headers needed to build packages using python39-mpi4py."
LICENSE = "BSD-2-Clause"

PV = "3.1.4"

RPM_NAME = "python39-mpi4py-devel-3.1.4-2.5.aarch64.rpm"
RPM_HASH = "af04eb8842d3ce297fb5b000c6418ed4e9dc7efe06e78c0e779935e6c3c5ccb38b713668e15b07b988e66e973f348506a58a7b464ad0db0bde4c4a3f763147d9"

RPROVIDES:${PN} += "python39-mpi4py-devel \
python39-mpi4py-devel(aarch-64)"
RDEPENDS:${PN} += "python39-devel \
python39-mpi4py \
python39-mpi4py-common-devel"

inherit rpm
