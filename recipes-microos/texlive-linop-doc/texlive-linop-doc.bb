SUMMARY = "Documentation for texlive-linop"
DESCRIPTION = "This package includes the documentation for texlive-linop"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn41304"

RPM_NAME = "texlive-linop-doc-2023.201.0.0.1svn41304-54.1.noarch.rpm"
RPM_HASH = "61aecd314fb4f7926fcfab90eac107c0fc63ea4abef71ced2f49c090230e759cc6580ab7de16dca420caca367e1728169de64d4e6a36e68762fbdc335327436f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linop-doc"
RDEPENDS:${PN} += ""

inherit rpm
