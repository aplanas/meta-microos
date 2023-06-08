SUMMARY = "Dependency package for python311-numpy_1_24_2-gnu-hpc"
DESCRIPTION = "python311-numpy: NumPy array processing for numbers, strings, records and objects \
The package python311-numpy-gnu-hpc provides the dependency to get binary package python311-numpy_1_24_2-gnu-hpc. \
When this package gets updated it installs the latest version of python311-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python311-numpy-gnu-hpc-1.24.2-2.1.aarch64.rpm"
RPM_HASH = "01902087bc2f2e1ff6839ea52c34a715136c8cdb08d5190d9ffb7cdfb950d69fdaaace5e058f25524b978ad023ec3d29085fa809bc6a08bb400ab91603d42266"

RPROVIDES:${PN} += "python311-numpy-gnu-hpc python311-numpy-gnu-hpc(aarch-64)"
RDEPENDS:${PN} += "/bin/sh python311-numpy_1_24_2-gnu-hpc"

inherit rpm
