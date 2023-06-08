SUMMARY = "Documentation for texlive-tikzmark"
DESCRIPTION = "This package includes the documentation for texlive-tikzmark"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.15svn64819"

RPM_NAME = "texlive-tikzmark-doc-2023.201.1.15svn64819-52.1.noarch.rpm"
RPM_HASH = "7ceec21fc4f117c1b0865f2a3665028eb92c7ca0deb15b44a00fd21ace599b8b93665b3016b64e8de5da751c03978cd7b0189d00681b8eb470af5008c56a83b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzmark-doc"
RDEPENDS:${PN} += ""

inherit rpm
