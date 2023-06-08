SUMMARY = "Documentation for texlive-bophook"
DESCRIPTION = "This package includes the documentation for texlive-bophook"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn17062"

RPM_NAME = "texlive-bophook-doc-2023.201.0.0.02svn17062-52.1.noarch.rpm"
RPM_HASH = "eec6ea3dd117dde5c7210fd25b0f2bc021309843562f2a40db8d6ce8e0b287285207f70439207489c834e91c03e3e6452e1c7f46a7a5129b6b4644c32f7db7b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bophook-doc"
RDEPENDS:${PN} += ""

inherit rpm
