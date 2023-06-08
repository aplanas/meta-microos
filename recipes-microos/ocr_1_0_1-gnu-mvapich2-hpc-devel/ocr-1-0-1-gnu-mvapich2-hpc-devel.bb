SUMMARY = "Headers and development files for the Open Community Runtime"
DESCRIPTION = "The Open Community Runtime project is an application \
building framework that explores methods for high-core-count \
programming with focus on HPC applications. \
 \
OCR headers and libraries files needed for development."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr_1_0_1-gnu-mvapich2-hpc-devel-1.0.1-5.9.aarch64.rpm"
RPM_HASH = "1dfda57a4db00a65f74d07cd2c9b6bdef871118796e2d24230645e473d9a16f9510006b783c23d7429725c3e9ca8aceff59e0043b4368569ad054ee46a826231"

RPROVIDES:${PN} += "ocr_1_0_1-gnu-mvapich2-hpc-devel ocr_1_0_1-gnu-mvapich2-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "gnu-compilers-hpc-devel mvapich2-gnu-hpc-devel ocr_1_0_1-gnu-mvapich2-hpc"

inherit rpm
