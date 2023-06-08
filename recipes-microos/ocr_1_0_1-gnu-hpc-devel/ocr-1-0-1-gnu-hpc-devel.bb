SUMMARY = "Headers and development files for the Open Community Runtime"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
OCR headers and libraries files needed for development."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-hpc-devel-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "22b25d85871ea04b4e4416cc837c4f0223308dd19ae2537e1893306124872d5c2f282f8fc3f51defeb69853b58f3737d8ef6152c20859a31b94171fe19440b9d"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-hpc-devel ocr_1_0_1-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel ocr_1_0_1-gnu-hpc"

inherit rpm
