SUMMARY = "Documentation for texlive-etoc"
DESCRIPTION = "This package includes the documentation for texlive-etoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn66299"

RPM_NAME = "texlive-etoc-doc-2023.201.1.2svn66299-52.1.noarch.rpm"
RPM_HASH = "79fb32666c7a0ec0c834ee773b070f82a2b489ee722ba6305724cb4af2739b5e157a75a002f478d4ba9e452abb2a9898e950191fe4b2b6b5e3e4f59bbcc5be52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etoc-doc"
RDEPENDS:${PN} += ""

inherit rpm
