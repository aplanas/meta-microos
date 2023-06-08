SUMMARY = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
DESCRIPTION = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "python310-scikit-build-0.17.2-2.1.noarch.rpm"
RPM_HASH = "734ba7c92dd743a975c5997f53f1bd4bf8c0a6ecbea07128d58841fecd1235d2ea12e9ba785f4502a8642a0a24aef1ebd9cad9bb4ccbad8bc1a4ed871b00e839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-build python3.10dist(scikit-build) python310-scikit-build python3dist(scikit-build)"
RDEPENDS:${PN} += "cmake python(abi) python310-distro python310-packaging python310-setuptools python310-tomli python310-wheel"

inherit rpm
