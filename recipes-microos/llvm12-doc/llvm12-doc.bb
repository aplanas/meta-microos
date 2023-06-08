SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "12.0.1"

RPM_NAME = "llvm12-doc-12.0.1-11.1.noarch.rpm"
RPM_HASH = "7354113a806aa040f8b2d1344c3b7219e0f77bfac6efa198ac6a145628e2fd29423627b6759dd20886f62a560559dde15a0966558da42e07c5d48ed3901a92b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider llvm12-doc"
RDEPENDS:${PN} += "llvm12"

inherit rpm
