SUMMARY = "Development files for pybind11"
DESCRIPTION = "This package contains files for developing applications using pybind11."
LICENSE = "BSD-3-Clause"

PV = "2.10.4"

RPM_NAME = "python311-pybind11-devel-2.10.4-2.1.noarch.rpm"
RPM_HASH = "225b6f331c00b83561ced27117f5e49b7ca3129d0a0b748f52fc2c1c658fbf460b18f918be28fc612534e85cc3f42b507c66691df043f5bbcb3c95fe64431089"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-pybind11-devel"
RDEPENDS:${PN} += "python(abi) \
python311-devel \
python311-pybind11 \
python311-pybind11-common-devel"

inherit rpm
