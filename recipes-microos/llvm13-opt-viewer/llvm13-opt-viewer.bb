SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-opt-viewer-13.0.1-9.1.noarch.rpm"
RPM_HASH = "e0c11d30c8d1f4c74ea2a609e780297fb978972a7578e76c1a054f6af2301e5213c5fdad00a83172101d7df1f22e25fc01400f0e95fdfd29dd3120a0fddbd8b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm13-opt-viewer \
opt-viewer"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-PyYAML \
python3-Pygments"

inherit rpm
