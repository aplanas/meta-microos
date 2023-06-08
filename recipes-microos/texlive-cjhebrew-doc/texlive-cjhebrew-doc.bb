SUMMARY = "Documentation for texlive-cjhebrew"
DESCRIPTION = "This package includes the documentation for texlive-cjhebrew"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2asvn43444"

RPM_NAME = "texlive-cjhebrew-doc-2023.201.0.0.2asvn43444-53.1.noarch.rpm"
RPM_HASH = "74ff85590e8a009513b82299f5cfe96033a8fcff2ebca646376b457b3c7ce6fc6e3913f6fa464ee63efe3b346e0070b6ca1cb9d10fe7de53314becb120177497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cjhebrew-doc"
RDEPENDS:${PN} += ""

inherit rpm
