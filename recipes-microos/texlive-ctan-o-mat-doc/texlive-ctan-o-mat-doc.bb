SUMMARY = "Documentation for texlive-ctan-o-mat"
DESCRIPTION = "This package includes the documentation for texlive-ctan-o-mat"
LICENSE = "BSD-3-Clause"

PV = "2023.204.1.2svn51578"

RPM_NAME = "texlive-ctan-o-mat-doc-2023.204.1.2svn51578-54.1.noarch.rpm"
RPM_HASH = "5a552abb49c452d14f65bef4fdae33072a8d110d9de087d21ef8e31a9c324a1a8eca81fbfd56f7bd01b949f18d4b65f38e47b0d581ec1e612e785f92c8c989b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(ctan-o-mat.1) texlive-ctan-o-mat-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
