SUMMARY = "Documentation for texlive-globalvals"
DESCRIPTION = "This package includes the documentation for texlive-globalvals"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn49962"

RPM_NAME = "texlive-globalvals-doc-2023.201.1.1svn49962-53.1.noarch.rpm"
RPM_HASH = "65e663b317923df0f8fd8143da3998ed17ad74ec0e5e101014eeff010cd200b534aff7be281cf5f091c0f5a0ed8759ec233ee5d1190f31ab982320b5b10d1dfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-globalvals-doc"
RDEPENDS:${PN} += ""

inherit rpm
