SUMMARY = "Examples for ocr_1_0_1-gnu-mpich-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Examples for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mpich-hpc-examples-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "1838cb97178acbedd8bd93a8d1b139aaafe7a2521d93c2ac10942701e8eca343fd8a47b2035a428ada8ae0fa41d21c50b9d617e43a10a475cabd4ed5a5331403"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-mpich-hpc-examples ocr_1_0_1-gnu-mpich-hpc-examples(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
