SUMMARY = "Documentation for texlive-mpcolornames"
DESCRIPTION = "This package includes the documentation for texlive-mpcolornames"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.20svn23252"

RPM_NAME = "texlive-mpcolornames-doc-2023.201.0.0.20svn23252-54.1.noarch.rpm"
RPM_HASH = "7bd157ce6744f788c8f58f3a5feab757b777f468d94e5937202441f7184bdc9cfeae4e27e001cf6082d62783253d8062f624dc92ba428baa4b8665cd0293c860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpcolornames-doc"
RDEPENDS:${PN} += ""

inherit rpm
