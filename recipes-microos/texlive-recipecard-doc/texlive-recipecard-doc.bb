SUMMARY = "Documentation for texlive-recipecard"
DESCRIPTION = "This package includes the documentation for texlive-recipecard"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-recipecard-doc-2023.201.2.0svn15878-53.1.noarch.rpm"
RPM_HASH = "849f533fdf5fd58819cb6f08ff87bfa8634e5531245ab63f4aff2e3b82e35b4165480f01caa3f26f4193eed7421170e0b92c48d847bf9c5ce3e739fd39675751"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recipecard-doc"
RDEPENDS:${PN} += ""

inherit rpm
