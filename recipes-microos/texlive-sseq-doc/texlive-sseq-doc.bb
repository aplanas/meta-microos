SUMMARY = "Documentation for texlive-sseq"
DESCRIPTION = "This package includes the documentation for texlive-sseq"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.01svn31585"

RPM_NAME = "texlive-sseq-doc-2023.201.2.01svn31585-57.1.noarch.rpm"
RPM_HASH = "146bf904778cfbf9ea07938d786301d471618760c9b0c11b071b86ce7802a0bc69ff175ccfb772a8a1592ae3dccf30b4d6fc7c71e701d02d45ab31b9b23a0600"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sseq-doc"
RDEPENDS:${PN} += ""

inherit rpm
