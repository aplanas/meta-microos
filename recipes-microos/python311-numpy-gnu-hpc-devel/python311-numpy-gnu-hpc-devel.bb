SUMMARY = "Dependency package for python311-numpy_1_24_2-gnu-hpc-devel"
DESCRIPTION = "python311-numpy: NumPy array processing for numbers, strings, records and objects \
The package python311-numpy-gnu-hpc-devel provides the dependency to get binary package python311-numpy_1_24_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of python311-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python311-numpy-gnu-hpc-devel-1.24.2-2.1.aarch64.rpm"
RPM_HASH = "5bd22720d49905ecd68839710b32b331c03e96a2838eab77a35bb4d0b3e6902ad1165fc20ce3ad0adbf40c044a9f86505024120375d999bb0afb7ac8dbc142f5"

RPROVIDES:${PN} += "python311-numpy-gnu-hpc-devel python311-numpy-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "python311-numpy_1_24_2-gnu-hpc-devel"

inherit rpm
