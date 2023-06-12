SUMMARY = "Dependency package for libsuperlu_6_0_0-gnu-hpc"
DESCRIPTION = "superlu: A general purpose library for the direct solution of linear equations \
The package libsuperlu-gnu-hpc provides the dependency to get binary package libsuperlu_6_0_0-gnu-hpc. \
When this package gets updated it installs the latest version of superlu_6_0_0-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "6.0.0"

RPM_NAME = "libsuperlu-gnu-hpc-6.0.0-2.1.aarch64.rpm"
RPM_HASH = "e15424c854a3e6c6bf53256f77499f1c4e292ce84827c56ebb216dc97fa56d887942095ea9c33a19215a3ed130577f38bfc71e22d560918084da9def786edc4b"

RPROVIDES:${PN} += "libsuperlu-gnu-hpc \
libsuperlu-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libsuperlu_6_0_0-gnu-hpc"

inherit rpm
