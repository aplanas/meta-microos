SUMMARY = "Documentation for ocr_1_0_1-gnu-hpc"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
Documentation for ocr packages."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-hpc-doc-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "877df8ca05f1cbb0971cd8cf5a9c361562d6c043fbc44966758e4700b3d4f90062368946418f68d2fe52abc22f05605de7e8cd127847574eb49e02d82bf2b615"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-hpc-doc ocr_1_0_1-gnu-hpc-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
