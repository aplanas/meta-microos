SUMMARY = "Documentation for texlive-datetime2-finnish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-finnish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn47047"

RPM_NAME = "texlive-datetime2-finnish-doc-2023.201.1.2svn47047-52.1.noarch.rpm"
RPM_HASH = "681da00c9d0129655b32907ff809aafa672e3b78f8aa828ab50b8bc2a71ba4b24dfe6aaa04dcbd8aaae42a9a67411422de14a3add5654de7658729035b88ff64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-finnish-doc"
RDEPENDS:${PN} += ""

inherit rpm
