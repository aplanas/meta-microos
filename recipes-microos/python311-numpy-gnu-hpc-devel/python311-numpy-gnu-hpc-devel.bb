SUMMARY = "Dependency package for python311-numpy_1_24_2-gnu-hpc-devel"
DESCRIPTION = "python311-numpy: NumPy array processing for numbers, strings, records and objects \
The package python311-numpy-gnu-hpc-devel provides the dependency to get binary package python311-numpy_1_24_2-gnu-hpc-devel. \
When this package gets updated it installs the latest version of python311-numpy_1_24_2-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python311-numpy-gnu-hpc-devel-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "938a86aaac870f6431115a6e96930e0842777069a972a264e4d652c5df84f1eaee6af76ad93700600bcf648be3685d0473836f6cb931ddee3c2e86c30f6ee275"

RPROVIDES:${PN} += "python311-numpy-gnu-hpc-devel python311-numpy-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "python311-numpy_1_24_2-gnu-hpc-devel"

inherit rpm
