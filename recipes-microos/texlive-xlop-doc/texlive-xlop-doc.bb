SUMMARY = "Documentation for texlive-xlop"
DESCRIPTION = "This package includes the documentation for texlive-xlop"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.28svn56910"

RPM_NAME = "texlive-xlop-doc-2023.201.0.0.28svn56910-52.1.noarch.rpm"
RPM_HASH = "0e7d2c0975e548865805c88e61c56e2633826970a2162c165c77bbb70ab5c05a5c490bddda46d35e6c98918433cd36b5100fb68d32e193e1318cbcf828215c70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-xlop-doc:fr;en) texlive-xlop-doc"
RDEPENDS:${PN} += ""

inherit rpm
