SUMMARY = "Documentation for texlive-bath-bst"
DESCRIPTION = "This package includes the documentation for texlive-bath-bst"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.0svn63398"

RPM_NAME = "texlive-bath-bst-doc-2023.201.6.0svn63398-53.1.noarch.rpm"
RPM_HASH = "3db39ea386140b786a5fe1adcc257aab28f4fc7a1404a226efadf5b9c901e504bc0a7977048195d075a4e63a919906231e3726b31c53ef16d00717b611fd430e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bath-bst-doc"
RDEPENDS:${PN} += ""

inherit rpm
