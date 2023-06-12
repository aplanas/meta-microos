SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi3-hpc-devel"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi3-hpc-devel provides the dependency to get binary package ocr_1_0_1-gnu-openmpi3-hpc-devel. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi3-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi3-hpc-devel-1.0.1-5.7.noarch.rpm"
RPM_HASH = "0ea0552d18ea122bf9b3870e055938af5065a80a5a0a52ff226abb660e4d7586ee4435b7525899345302bb032a8a6befe0d674d0ccad48f34e0eece5e81c70fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi3-hpc-devel"
RDEPENDS:${PN} += "/bin/sh \
ocr_1_0_1-gnu-openmpi3-hpc-devel"

inherit rpm
