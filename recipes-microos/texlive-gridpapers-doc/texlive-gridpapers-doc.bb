SUMMARY = "Documentation for texlive-gridpapers"
DESCRIPTION = "This package includes the documentation for texlive-gridpapers"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn58723"

RPM_NAME = "texlive-gridpapers-doc-2023.201.1.0.2svn58723-53.1.noarch.rpm"
RPM_HASH = "4ded3ca9cb9fd79fa30aecae8ec6be053fa470f0e996124aa85417519927ee14d4febc1a386bd338fc64921ff77e348e63fc54de0dfcff9f30ddcc19466fd7d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gridpapers-doc"
RDEPENDS:${PN} += ""

inherit rpm
