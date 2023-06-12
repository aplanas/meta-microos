SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi4-hpc-examples"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi4-hpc-examples provides the dependency to get binary package ocr_1_0_1-gnu-openmpi4-hpc-examples. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi4-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi4-hpc-examples-1.0.1-5.8.noarch.rpm"
RPM_HASH = "aa0faa0c900c57ea198f9c764bcad9026908ad05fae36b5d4c24684e97d862c6c780cc3e8e0bce61be938e942ad6d87dfa628bbbd647cefe52b37164d69fa8dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi4-hpc-examples"
RDEPENDS:${PN} += "/bin/sh \
ocr_1_0_1-gnu-openmpi4-hpc-examples"

inherit rpm
