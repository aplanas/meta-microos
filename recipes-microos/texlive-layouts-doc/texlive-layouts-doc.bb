SUMMARY = "Documentation for texlive-layouts"
DESCRIPTION = "This package includes the documentation for texlive-layouts"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.6dsvn42428"

RPM_NAME = "texlive-layouts-doc-2023.201.2.6dsvn42428-54.1.noarch.rpm"
RPM_HASH = "f328547086d8e7adaa42c59c54f432c8a8ee03cb1b1f99e391550b00fc77a9b41db73ee6efc0c23cc8f7e2489e588502a1d17e0d9fbccbefc047dd1328cba7a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-layouts-doc"
RDEPENDS:${PN} += ""

inherit rpm
