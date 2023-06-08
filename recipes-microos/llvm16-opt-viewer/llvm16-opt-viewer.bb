SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.2"

RPM_NAME = "llvm16-opt-viewer-16.0.2-1.1.noarch.rpm"
RPM_HASH = "1030b4e667aa63132ebbb3649b321ea065b17edf83f849c00203aa8a307735934f4f7769b676d604e05be17c5f4301b5919ea2d231a884129d4b073ca23bf077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm16-opt-viewer opt-viewer"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-PyYAML python3-Pygments"

inherit rpm
