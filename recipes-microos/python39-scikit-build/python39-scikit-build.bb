SUMMARY = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
DESCRIPTION = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python39-scikit-build-0.17.2-2.1.noarch.rpm"
RPM_HASH = "24f3ba7f2df56e8d99480854cb874ef1a6f4f4b61b3af7a1d0889bf424df7a06936fa42f00cde5bf58f0b7f23e371252f31514dc296cba096267e6401faaabe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(scikit-build) python39-scikit-build python3dist(scikit-build)"
RDEPENDS:${PN} += "cmake python(abi) python39-distro python39-packaging python39-setuptools python39-tomli python39-wheel"

inherit rpm
