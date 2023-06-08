SUMMARY = "Development files for pybind11"
DESCRIPTION = "This package contains files for developing applications using pybind11."
LICENSE = "BSD-3-Clause"

PV = "2.10.4"

RPM_NAME = "python310-pybind11-devel-2.10.4-2.1.noarch.rpm"
RPM_HASH = "d508a821d9105baf3bf884a10e90d93cfffa186f33d6a301ecd115dcdad2aefa30f5558c8b04f9865b2cf8e0cd144511660713d751f4476d42ca71df50d3ee69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybind11-devel python310-pybind11-devel"
RDEPENDS:${PN} += "python(abi) python310-devel python310-pybind11 python310-pybind11-common-devel"

inherit rpm
