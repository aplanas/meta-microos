SUMMARY = "Documentation for texlive-schulmathematik"
DESCRIPTION = "This package includes the documentation for texlive-schulmathematik"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn64108"

RPM_NAME = "texlive-schulmathematik-doc-2023.201.1.3svn64108-53.1.noarch.rpm"
RPM_HASH = "7da52979e1abbcb2e0647c8990586d2cfcb761c86bc67611776e825fd5a5b614b545fcb22bf5114662bd7f4f331974fa443e7f93e8150cbe663cbe7d8ceb4120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schulmathematik-doc"
RDEPENDS:${PN} += ""

inherit rpm
