SUMMARY = "Dependency package for python310-numpy_1_24_2-gnu-hpc-devel"
DESCRIPTION = "python310-numpy: NumPy array processing for numbers, strings, records and objects \
The package python310-numpy-gnu-hpc-devel provides the dependency to get binary package python310-numpy_1_24_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of python310-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python310-numpy-gnu-hpc-devel-1.24.2-2.1.aarch64.rpm"
RPM_HASH = "e03b1d17490fa74284be91091cf88ac30537de9459489fab4ac956cedabfc2fe50ee7cef767fc9e03abf46951643d0fac5ff7e72a7205be8ac4c240ecf9f98e1"

RPROVIDES:${PN} += "python3-numpy-gnu-hpc-devel python310-numpy-gnu-hpc-devel python310-numpy-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "python310-numpy_1_24_2-gnu-hpc-devel"

inherit rpm
