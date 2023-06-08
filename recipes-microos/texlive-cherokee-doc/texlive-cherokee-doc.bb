SUMMARY = "Documentation for texlive-cherokee"
DESCRIPTION = "This package includes the documentation for texlive-cherokee"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21046"

RPM_NAME = "texlive-cherokee-doc-2023.201.svn21046-53.1.noarch.rpm"
RPM_HASH = "fc6f74b6954b88a1e0cc4563dd9a9d9a3b6908c38c9d6c5041672817983a87bbb0bc049c94892e3e52c7ff46023fb42edd17ed93c635cc22170d8301a60e8ce7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cherokee-doc"
RDEPENDS:${PN} += ""

inherit rpm
