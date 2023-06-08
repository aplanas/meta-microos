SUMMARY = "Documentation for texlive-letgut"
DESCRIPTION = "This package includes the documentation for texlive-letgut"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.6svn65548"

RPM_NAME = "texlive-letgut-doc-2023.201.0.0.9.6svn65548-54.1.noarch.rpm"
RPM_HASH = "15b9d3fb3501e84cee16bb108d3f11da2e27d9b6e30e28364dd881685d897821d6e202e5cb80bbccdb036593f228cdff95f42d60f2553867f52f7097180ffd10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-letgut-doc"
RDEPENDS:${PN} += ""

inherit rpm
