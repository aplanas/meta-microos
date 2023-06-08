SUMMARY = "Dependency package for ocr_1_0_1-gnu-openmpi2-hpc-doc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-openmpi2-hpc-doc provides the dependency to get binary package ocr_1_0_1-gnu-openmpi2-hpc-doc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-openmpi2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-openmpi2-hpc-doc-1.0.1-5.8.noarch.rpm"
RPM_HASH = "285ccdb50c734e6398b8b3712f46362cbf5abb6b844626a187173b5439ac3ade5c72d806b5db783863917eccbde62c5093defefbde86c63bb13d3be99f2e5d8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-openmpi2-hpc-doc"
RDEPENDS:${PN} += "ocr_1_0_1-gnu-openmpi2-hpc-doc"

inherit rpm
