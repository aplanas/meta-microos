SUMMARY = "Documentation for texlive-frpseudocode"
DESCRIPTION = "This package includes the documentation for texlive-frpseudocode"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn56088"

RPM_NAME = "texlive-frpseudocode-doc-2023.201.0.0.3.0svn56088-52.1.noarch.rpm"
RPM_HASH = "f4a7c920c43073773bc7d1d1dc02d6fd5d8ab8fe587ad4c26cc312e1cf65e445676283b06d55a7abd1899e24829ef42d29b8bf9b9c195e0826bf7e042e4428a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frpseudocode-doc"
RDEPENDS:${PN} += ""

inherit rpm
