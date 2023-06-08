SUMMARY = "Dependency package for python310-numpy_1_24_2-gnu-hpc"
DESCRIPTION = "python310-numpy: NumPy array processing for numbers, strings, records and objects \
The package python310-numpy-gnu-hpc provides the dependency to get binary package python310-numpy_1_24_2-gnu-hpc. \
When this package gets updated it installs the latest version of python310-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python310-numpy-gnu-hpc-1.24.2-2.1.aarch64.rpm"
RPM_HASH = "67a4d93a65581c45afe72b2511dfecdc33d592db7d903cc6d85f69737999da68dae991097a506f5e00a41748be7b7a72fe1c7859337a49960287eaf6694d435f"

RPROVIDES:${PN} += "python3-numpy-gnu-hpc python310-numpy-gnu-hpc python310-numpy-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh python310-numpy_1_24_2-gnu-hpc"

inherit rpm
