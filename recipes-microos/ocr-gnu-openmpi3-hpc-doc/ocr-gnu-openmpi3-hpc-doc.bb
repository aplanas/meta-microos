SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi3-hpc-doc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi3-hpc-doc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi3-hpc-doc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi3-hpc-doc-1.0.1-5.7.noarch.rpm"
RPM_HASH = "e73a134426c8d5caa9b71d9e2d7adf00f48ad0366f4f0b5220069bcc86f773ae3f9a274ce0fd98bc901868bbd89e95572fbfb24cc33ee59b74f1adc752b46b6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi3-hpc-doc"
RDEPENDS:${PN} += "ocr_1_0_1-gnu-openmpi3-hpc-doc"

inherit rpm
