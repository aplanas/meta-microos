SUMMARY = "Python extensions in C++"
DESCRIPTION = "PyCXX is a set of classes to help create extensions of Python in the \
C++ language. The first part encapsulates the Python C API taking care \
of exceptions and ref counting. The second part supports the building \
of Python extension modules in C++."
LICENSE = "BSD-3-Clause"

PV = "7.1.7"

RPM_NAME = "python311-pycxx-7.1.7-1.6.noarch.rpm"
RPM_HASH = "abb615b932e49b2e18f0f9acbddb5546cea4f8590c64ef21f4847716701074149328191b109dd945705dd7daebfa5150fbcd98e8a67271baaf88fa019502c4e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cxx) python311-CXX python311-cxx python311-pycxx python3dist(cxx)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
