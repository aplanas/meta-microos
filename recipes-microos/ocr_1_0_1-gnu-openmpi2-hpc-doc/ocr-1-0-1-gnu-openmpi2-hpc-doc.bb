SUMMARY = "Documentation for ocr_1_0_1-gnu-openmpi2-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Documentation for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-openmpi2-hpc-doc-1.0.1-5.8.aarch64.rpm"
RPM_HASH = "c4a3c2688521ee8471cafa2576b2948b121e6fc855bb165aeff040c6ff06aa27a4c79f6ebdef10a5aef8849f00ad1029d200a5eb27b43ba5636ba3944452f73f"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-openmpi2-hpc-doc \
ocr_1_0_1-gnu-openmpi2-hpc-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
