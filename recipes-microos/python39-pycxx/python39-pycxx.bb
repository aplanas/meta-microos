SUMMARY = "Python extensions in C++"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.7"

RPM_NAME = "python39-pycxx-7.1.7-1.6.noarch.rpm"
RPM_HASH = "38f4810e7577bf5413701e157f2047ff606a13d7dd6a7e2bf0b894092182cf92b062123a7881f003f9ce13d861d17ce01793a9eed7876c0a6a9228b0349cb36d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cxx) python39-CXX python39-cxx python39-pycxx python3dist(cxx)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
