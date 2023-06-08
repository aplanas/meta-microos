SUMMARY = "Documentation for texlive-askinclude"
DESCRIPTION = "This package includes the documentation for texlive-askinclude"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn54725"

RPM_NAME = "texlive-askinclude-doc-2023.201.2.7svn54725-53.1.noarch.rpm"
RPM_HASH = "be96b1919bf7f87eb408334e1fc4f21364e0399d6c2e6d3bb40716d468ead036c46be5e240651cacf0d9874eb9fa2bc09abcfad4d785111b7bf34212f8715484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-askinclude-doc"
RDEPENDS:${PN} += ""

inherit rpm
