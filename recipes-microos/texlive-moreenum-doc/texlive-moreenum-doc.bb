SUMMARY = "Documentation for texlive-moreenum"
DESCRIPTION = "This package includes the documentation for texlive-moreenum"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn24479"

RPM_NAME = "texlive-moreenum-doc-2023.201.1.03svn24479-54.1.noarch.rpm"
RPM_HASH = "1808021e770d11c86da7899fddd766d389b50cba8aa9dcf8556b9e6bfcbe40e6726e2155c249a0ff10246e923e923bce40e3cc1d930281a2efdb47e4936af18c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moreenum-doc"
RDEPENDS:${PN} += ""

inherit rpm
