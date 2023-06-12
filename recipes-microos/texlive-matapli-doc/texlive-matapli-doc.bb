SUMMARY = "Documentation for texlive-matapli"
DESCRIPTION = "This package includes the documentation for texlive-matapli"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.0svn62632"

RPM_NAME = "texlive-matapli-doc-2023.201.1.2.0svn62632-52.1.noarch.rpm"
RPM_HASH = "e8ff954edac64f69a6d8c095becfd84d3c70e2fc0c6c8188ecfd5a2e533bab98a0c449bc1f1fbe59d90a891f86d09268261cee61d7e630eaef4439178aeb7e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-matapli-doc:fr) \
texlive-matapli-doc"
RDEPENDS:${PN} += ""

inherit rpm
