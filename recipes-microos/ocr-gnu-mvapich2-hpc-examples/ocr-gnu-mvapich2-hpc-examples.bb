SUMMARY = "Dependency package for ocr_1_0_1-gnu-mvapich2-hpc-examples"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mvapich2-hpc-examples provides the dependency to get binary package ocr_1_0_1-gnu-mvapich2-hpc-examples. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mvapich2-hpc-examples-1.0.1-5.9.noarch.rpm"
RPM_HASH = "39d955900cc61c69a0b3bb4bcb076c424ada9747e66db4e1c51e5f8b4545faf4d117af46ab12d145ab709525225eb28d4f1ec660350794471a2e418070c025af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mvapich2-hpc-examples"
RDEPENDS:${PN} += "/bin/sh \
ocr_1_0_1-gnu-mvapich2-hpc-examples"

inherit rpm
