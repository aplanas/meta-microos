SUMMARY = "Headers and development files for the Open Community Runtime"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
OCR headers and libraries files needed for development."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mpich-hpc-devel-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "d61acaabbff0271db4a586eaa23e1f37af63a3cded8cfde7a6aedf4d61eac411a0454728e9608dbf7eec567e60627935add79da654d5ccbb50ae2cdc83602417"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-mpich-hpc-devel ocr_1_0_1-gnu-mpich-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel mpich-gnu-hpc-devel ocr_1_0_1-gnu-mpich-hpc"

inherit rpm
