SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-opt-viewer-13.0.1-8.1.noarch.rpm"
RPM_HASH = "ddebf30ac2e5b0baee28f796e147ccc7020970090f569c4abea2257777a92918607fce7aa69bc749359aa3a8bd7ef42be7b60a598796a97cd94b29db399c2307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm13-opt-viewer opt-viewer"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-PyYAML python3-Pygments"

inherit rpm
