SUMMARY = "Documentation for texlive-langsci"
DESCRIPTION = "This package includes the documentation for texlive-langsci"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65793"

RPM_NAME = "texlive-langsci-doc-2023.201.svn65793-55.1.noarch.rpm"
RPM_HASH = "16f9b42af81c9abd492471a158b8eee5bb5f5291d8d2ce2167bf3bf923124860e052a96d1cf132ed5c6c4ee7423a40cfe8f8f5c36c3976d5611fd855d2e365b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-langsci-doc"
RDEPENDS:${PN} += ""

inherit rpm
