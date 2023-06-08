SUMMARY = "Documentation for texlive-latex-uni8"
DESCRIPTION = "This package includes the documentation for texlive-latex-uni8"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03svn49729"

RPM_NAME = "texlive-latex-uni8-doc-2023.201.0.0.03svn49729-55.1.noarch.rpm"
RPM_HASH = "b5fca44bdd1535041a2d1b4631c80c84662a8957fd0319064b555f5532be76ee471781373698fc0799bf23f679764396b63fb99e9aabeffe3773664a9420be6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-uni8-doc"
RDEPENDS:${PN} += ""

inherit rpm
