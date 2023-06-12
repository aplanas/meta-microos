SUMMARY = "Development files for pycxx applications"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.7"

RPM_NAME = "python311-pycxx-devel-7.1.7-1.6.noarch.rpm"
RPM_HASH = "c65626838b9ce649cfc005cb4e7990ec7bde24b2bdf1cee8700a0bd29fb2d12894ccce7e86bac4b6c5ce94d949a8e4785b9d4bc9b9b4b4c280493b157897774f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-CXX-devel \
python311-cxx-devel \
python311-pycxx-devel"
RDEPENDS:${PN} += "python311-pycxx"

inherit rpm
