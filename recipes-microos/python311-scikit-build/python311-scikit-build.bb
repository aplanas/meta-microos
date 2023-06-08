SUMMARY = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
DESCRIPTION = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python311-scikit-build-0.17.2-2.1.noarch.rpm"
RPM_HASH = "54e4f0562d94b9f05f5b5cf65acd0c8d51945e2e2419e18fdda05e7c4b60b9b2d9503e706cabeaeaa87b53fd066f21b76eeecd408b7bccc3ca981b000af12199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(scikit-build) python311-scikit-build python3dist(scikit-build)"
RDEPENDS:${PN} += "cmake python(abi) python311-distro python311-packaging python311-setuptools python311-wheel"

inherit rpm
