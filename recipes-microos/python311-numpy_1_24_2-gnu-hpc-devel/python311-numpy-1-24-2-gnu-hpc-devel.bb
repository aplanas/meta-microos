SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python311-numpy_1_24_2-gnu-hpc-devel-1.24.2-2.1.aarch64.rpm"
RPM_HASH = "0e14d175b616736e4ec09dca2e95e2c8a84dbb8f22407243e70efcac75635185edad4e26665a19abeb8b01056cd893dd81ff83360893df42406dce4bc94aa15f"

RPROVIDES:${PN} += "python311-numpy_1_24_2-gnu-hpc-devel python311-numpy_1_24_2-gnu-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "libopenblas-gnu-hpc-devel python(abi) python311-devel python311-numpy_1_24_2-gnu-hpc"

inherit rpm
