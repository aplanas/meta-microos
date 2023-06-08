SUMMARY = "Documentation for texlive-cntformats"
DESCRIPTION = "This package includes the documentation for texlive-cntformats"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn34668"

RPM_NAME = "texlive-cntformats-doc-2023.201.0.0.7svn34668-53.1.noarch.rpm"
RPM_HASH = "53466879d86fc7334e533a79f42c553d4db60612379e64bef944e9997cdab716871ac9d6e2b85f5fa9a49d4ff99f4f699a9759312fc79de15a0eca4db27094dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cntformats-doc"
RDEPENDS:${PN} += ""

inherit rpm
