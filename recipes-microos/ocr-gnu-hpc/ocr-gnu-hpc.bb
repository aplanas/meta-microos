SUMMARY = "Dependency package for ocr_1_0_1-gnu-hpc"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-hpc provides the dependency to get binary package ocr_1_0_1-gnu-hpc. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-hpc-1.0.1-5.9.noarch.rpm"
RPM_HASH = "8cdf2fbaa5e4fb0548ba90c84886808f0476e2ed792a960eca32b26134a3ad791774d04aca157a0c5fce32cc06ee26f391244ad781fe6f64621be148f09ce6dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-hpc"
RDEPENDS:${PN} += "/bin/sh \
ocr_1_0_1-gnu-hpc"

inherit rpm
