SUMMARY = "Examples for ocr_1_0_1-gnu-openmpi4-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Examples for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi4-hpc-examples-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "beed9f95a8ca99547426c4ba8b00f792f06d450a648a5be7b4d65cd074567c25a856098c5ef2c4dbef16e70d201de9c7ec6658bb83f832b559af45497354fb9e"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-openmpi4-hpc-examples ocr_1_0_1-gnu-openmpi4-hpc-examples(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
