SUMMARY = "Development files for python310-mpi4py"
DESCRIPTION = "Development libraries and headers needed to build packages using python310-mpi4py."
LICENSE = "BSD-2-Clause"

PV = "3.1.4"

RPM_NAME = "python310-mpi4py-devel-3.1.4-2.5.aarch64.rpm"
RPM_HASH = "d8f98667f6b90a2c6f25f89da13c19002ccca48382045fffdbb0ea322e2ec40682a47bdf346998f49e1e7dc711f0e0f038c6e02406b42f12dcc55ad089b8f028"

RPROVIDES:${PN} += "python3-mpi4py-devel \
python310-mpi4py-devel \
python310-mpi4py-devel(aarch-64)"
RDEPENDS:${PN} += "python310-devel \
python310-mpi4py \
python310-mpi4py-common-devel"

inherit rpm
