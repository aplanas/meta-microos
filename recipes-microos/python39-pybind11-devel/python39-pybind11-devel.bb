SUMMARY = "Development files for pybind11"
DESCRIPTION = "This package contains files for developing applications using pybind11."
LICENSE = "BSD-3-Clause"

PV = "2.10.4"

RPM_NAME = "python39-pybind11-devel-2.10.4-2.1.noarch.rpm"
RPM_HASH = "04c2358d4e62192771bcca9745a8d09e405f65eb6a93e96c803fa7e6ebf3f1285b3f024f8c12047f1d2f9453efb00b88be4418f07150d34628c79bdf8ac89e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pybind11-devel"
RDEPENDS:${PN} += "python(abi) python39-devel python39-pybind11 python39-pybind11-common-devel"

inherit rpm
