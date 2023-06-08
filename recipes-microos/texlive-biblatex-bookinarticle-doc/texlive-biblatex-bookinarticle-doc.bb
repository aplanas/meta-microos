SUMMARY = "Documentation for texlive-biblatex-bookinarticle"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-bookinarticle"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.1asvn40323"

RPM_NAME = "texlive-biblatex-bookinarticle-doc-2023.201.1.3.1asvn40323-53.1.noarch.rpm"
RPM_HASH = "b433c3d4716ba554816c6ff55d9e66f36dfb66aa33c097a2ff50f13afcdc74f62a22f21cb210087820dacfd5edb04389855f2ebb7d91ea4a304eed51263518a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-bookinarticle-doc"
RDEPENDS:${PN} += ""

inherit rpm
