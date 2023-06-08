SUMMARY = "Python Bindings Generator"
DESCRIPTION = "A tool to generate Python bindings for C/C++ code."
LICENSE = "LGPL-2.1-only"

PV = "0.22.1"

RPM_NAME = "python39-PyBindGen-0.22.1-1.3.noarch.rpm"
RPM_HASH = "07276363101faf44f9f5a34e90b045f5cf782b61a6f926e80d67f0e99f1094fdbf0b44d0f91cae53ae1f20eee4add481d56d53227cc682ce8a9d64526251be8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pybindgen) python39-PyBindGen python3dist(pybindgen)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
