SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "11.0.1"

RPM_NAME = "llvm11-opt-viewer-11.0.1-12.1.noarch.rpm"
RPM_HASH = "377a5ea73d0ecf903641f05550b3c1096e34dc55aa7a4bd87f75d34aa7db11e5ee38ad3953fc31d6c470ec1c38006dda55e626f01890ab9d47768bb5a21f965f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm11-opt-viewer opt-viewer"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-PyYAML python3-Pygments"

inherit rpm
