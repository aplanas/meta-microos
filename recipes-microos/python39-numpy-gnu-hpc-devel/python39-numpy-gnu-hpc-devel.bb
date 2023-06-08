SUMMARY = "Dependency package for python39-numpy_1_24_2-gnu-hpc-devel"
DESCRIPTION = "python39-numpy: NumPy array processing for numbers, strings, records and objects \
The package python39-numpy-gnu-hpc-devel provides the dependency to get binary package python39-numpy_1_24_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of python39-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python39-numpy-gnu-hpc-devel-1.24.2-2.1.aarch64.rpm"
RPM_HASH = "3092d4d006fd6ae01bf7aae87d4d8570a0f096ba0e7e3756fcccc212ae9bc4e62ac594fec96884cf7cf49131c7d62266a0e025c7e15380f57a8de31f6664bc88"

RPROVIDES:${PN} += "python39-numpy-gnu-hpc-devel python39-numpy-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "python39-numpy_1_24_2-gnu-hpc-devel"

inherit rpm
