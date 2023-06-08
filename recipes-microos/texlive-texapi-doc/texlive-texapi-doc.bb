SUMMARY = "Documentation for texlive-texapi"
DESCRIPTION = "This package includes the documentation for texlive-texapi"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.04svn54080"

RPM_NAME = "texlive-texapi-doc-2023.201.1.04svn54080-54.1.noarch.rpm"
RPM_HASH = "4735c1a38ffcc78c3f618656ef301e6ebbf5b9580ce553ba018b6868a2a45d3a39ff577cd0574abf3b0d1b583e780bf8a05bbab82c67e82f28db4771ffe986de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texapi-doc"
RDEPENDS:${PN} += ""

inherit rpm
