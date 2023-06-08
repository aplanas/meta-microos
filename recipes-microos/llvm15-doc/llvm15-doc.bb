SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "15.0.7"

RPM_NAME = "llvm15-doc-15.0.7-2.4.noarch.rpm"
RPM_HASH = "39d9aff495772ba81aa7d11c9558ecab5094a795bf5ea9df3a73b12c74868675b53251a33448a9c13823ec389a42dfb0a399f27e2173f91c9212e45d901afd06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider llvm15-doc"
RDEPENDS:${PN} += "llvm15"

inherit rpm
