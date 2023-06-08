SUMMARY = "Documentation for texlive-texlive.infra"
DESCRIPTION = "This package includes the documentation for texlive-texlive.infra"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66512"

RPM_NAME = "texlive-texlive.infra-doc-2023.201.svn66512-54.1.noarch.rpm"
RPM_HASH = "765197ab6f51835c3b6419739dae35b33d2bfea8183ab068ba0e92d400a52d82aca167569a3d7625dc872f44e67c9968bbeb1b71a7e46252f266e774a7f515b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(mktexlsr.1) man(tlmgr.1) texlive-texlive.infra-doc"
RDEPENDS:${PN} += ""

inherit rpm
