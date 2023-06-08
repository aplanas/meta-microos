SUMMARY = "Dependency package for ocr_1_0_1-gnu-mvapich2-hpc-devel"
DESCRIPTION = "ocr: Open Community Runtime (OCR) for shared memory \
The package ocr-gnu-mvapich2-hpc-devel provides the dependency to get binary package ocr_1_0_1-gnu-mvapich2-hpc-devel. \
When this package gets updated it installs the latest version of ocr_1_0_1-gnu-mvapich2-hpc."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "ocr-gnu-mvapich2-hpc-devel-1.0.1-5.9.noarch.rpm"
RPM_HASH = "ae1a2266378ddb90eb77288fa41eb154f7c0117dc0f5e737cade6e25b47a58d3a393d1df1a6c2f46cbef8f7ddc2cc3a3f820cb237c8c5468e3191194c95f4895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ocr-gnu-mvapich2-hpc-devel"
RDEPENDS:${PN} += "/bin/sh ocr_1_0_1-gnu-mvapich2-hpc-devel"

inherit rpm
