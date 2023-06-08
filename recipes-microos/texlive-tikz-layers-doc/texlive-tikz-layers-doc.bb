SUMMARY = "Documentation for texlive-tikz-layers"
DESCRIPTION = "This package includes the documentation for texlive-tikz-layers"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn46660"

RPM_NAME = "texlive-tikz-layers-doc-2023.201.0.0.9svn46660-52.1.noarch.rpm"
RPM_HASH = "a0dfd89bbc9acf92bdb4dbd946e479883683e38568b5fdc580006de7a9eb5922711fc16a689aab5291d6bada349b44b112ac86f3c4fe4ca3391dda07be130b9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-layers-doc"
RDEPENDS:${PN} += ""

inherit rpm
