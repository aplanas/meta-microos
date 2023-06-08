SUMMARY = "Documentation for texlive-typicons"
DESCRIPTION = "This package includes the documentation for texlive-typicons"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.7svn37623"

RPM_NAME = "texlive-typicons-doc-2023.201.2.0.7svn37623-52.1.noarch.rpm"
RPM_HASH = "ee6fc338579e1ab3476bd7e769060f3aeb79f1d4a02588b77a34ab229381407d0156a65f3c6084bdb4350c7e28ca58247a02aa9136c671687812fcf61be0d2ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typicons-doc"
RDEPENDS:${PN} += ""

inherit rpm
