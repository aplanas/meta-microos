SUMMARY = "Examples for ocr_1_0_1-gnu-openmpi3-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Examples for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi3-hpc-examples-1.0.1-5.7.aarch64.rpm"
RPM_HASH = "dc34812bd6b83f22e1e8821000671535f7523816634b26e50e8836503db9e6af7a5adaf0b35cf48205c222d26cd2445d53b6bc77cf8b86b0ec73ffed56b5547d"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-openmpi3-hpc-examples \
ocr_1_0_1-gnu-openmpi3-hpc-examples(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
