SUMMARY = "Dependency package for python39-numpy_1_24_2-gnu-hpc"
DESCRIPTION = "python39-numpy: NumPy array processing for numbers, strings, records and objects \
The package python39-numpy-gnu-hpc provides the dependency to get binary package python39-numpy_1_24_2-gnu-hpc. \
When this package gets updated it installs the latest version of python39-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python39-numpy-gnu-hpc-1.24.2-2.1.aarch64.rpm"
RPM_HASH = "8465b7c1b615cdb3c9bc040287d9cd7660eaf10c9edc241981d516bc23d7eac754620724b422b33da8d410dfa23f5d5cc061e7b2daaa9466dfc0853cc3d544f9"

RPROVIDES:${PN} += "python39-numpy-gnu-hpc python39-numpy-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh python39-numpy_1_24_2-gnu-hpc"

inherit rpm
