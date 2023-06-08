SUMMARY = "Documentation for texlive-latex"
DESCRIPTION = "This package includes the documentation for texlive-latex"
LICENSE = "LPPL-1.0"

PV = "2023.201.20221101_pl1svn65161"

RPM_NAME = "texlive-latex-doc-2023.201.20221101_pl1svn65161-55.1.noarch.rpm"
RPM_HASH = "39d9439947144027c690d281344e2bd42c0a13467b9d30b239ec39acd76596b9862c950842ad7089c898c80fb093af5c9e8d11b61865b21715c8e77c04c60c4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-doc"
RDEPENDS:${PN} += ""

inherit rpm
