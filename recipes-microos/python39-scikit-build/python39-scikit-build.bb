SUMMARY = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
DESCRIPTION = "Improved build system generator for Python C/C++/Fortran/Cython extensions"
LICENSE = "MIT"

PV = "0.17.5"

RPM_NAME = "python39-scikit-build-0.17.5-1.1.noarch.rpm"
RPM_HASH = "079faef3464f95e1c8bb679a2cd32add74be99aa0b6bad9448844dd73f763a887c9cb1707e702567eb1e0aa3a8bff5e2cd3d719b0142018627ed866e872d6ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(scikit-build) \
python39-scikit-build \
python3dist(scikit-build)"
RDEPENDS:${PN} += "cmake \
python(abi) \
python39-distro \
python39-packaging \
python39-setuptools \
python39-tomli \
python39-wheel"

inherit rpm
