SUMMARY = "Documentation for texlive-uantwerpendocs"
DESCRIPTION = "This package includes the documentation for texlive-uantwerpendocs"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.4svn64165"

RPM_NAME = "texlive-uantwerpendocs-doc-2023.201.4.4svn64165-52.1.noarch.rpm"
RPM_HASH = "a999f802202bac17740bdc202e8c927b1c8c85d84ab82b99c58af9c8aebe774a52544730d8c950d4071553b284fba7018dcac0367bd9d29ad903ef9c2b1b4fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uantwerpendocs-doc"
RDEPENDS:${PN} += ""

inherit rpm
