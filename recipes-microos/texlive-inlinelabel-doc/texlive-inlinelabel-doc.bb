SUMMARY = "Documentation for texlive-inlinelabel"
DESCRIPTION = "This package includes the documentation for texlive-inlinelabel"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.1svn63853"

RPM_NAME = "texlive-inlinelabel-doc-2023.201.1.2.1svn63853-52.1.noarch.rpm"
RPM_HASH = "a4f3ded09b84350ccc7e2f5f1232e9313b90aaf18bd8c4f3e0a832cc23fb91e58b3d61cc98dbe027abd09dabaab78afb526dda4b8e857ae6908a6fd1e5b6f509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inlinelabel-doc"
RDEPENDS:${PN} += ""

inherit rpm
