SUMMARY = "Documentation for texlive-unisugar"
DESCRIPTION = "This package includes the documentation for texlive-unisugar"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.92svn22357"

RPM_NAME = "texlive-unisugar-doc-2023.201.0.0.92svn22357-53.1.noarch.rpm"
RPM_HASH = "d222c9b8fb24083878429bb22cb4795f9dbf53462c90446031b5fe40769208faaa4317d43717faf996ee4033f79fdd8419fa6ed83b46d9a6bd9e7ca034c485da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unisugar-doc"
RDEPENDS:${PN} += ""

inherit rpm
