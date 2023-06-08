SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-opt-viewer-12.0.1-11.1.noarch.rpm"
RPM_HASH = "d4adee0b80f6b52e022870f6ea88580255d0a675955a06ae1e8e2d157dc9e0bf87de9ee26ae727ca4231c61fb659e4aae9be958e109b0015be6e6a3d882471d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm12-opt-viewer opt-viewer"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-PyYAML python3-Pygments"

inherit rpm
