SUMMARY = "Documentation for texlive-mflogo"
DESCRIPTION = "This package includes the documentation for texlive-mflogo"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn42428"

RPM_NAME = "texlive-mflogo-doc-2023.201.2.0svn42428-54.1.noarch.rpm"
RPM_HASH = "2e5acfafbfecf713ccf4faa51003f36551f72053792db83f29f81fd2351bb0943cdccd9c4902c7f9694b547a145198f09be5687b3928cab1ca335d9a2e76fdbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mflogo-doc"
RDEPENDS:${PN} += ""

inherit rpm
