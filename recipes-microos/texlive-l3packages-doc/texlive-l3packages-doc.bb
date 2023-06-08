SUMMARY = "Documentation for texlive-l3packages"
DESCRIPTION = "This package includes the documentation for texlive-l3packages"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65722"

RPM_NAME = "texlive-l3packages-doc-2023.201.svn65722-55.1.noarch.rpm"
RPM_HASH = "d0866413f2409982b02778a30b40713771f962b9d9e71afc091300efce96f07ba98fc75d3a78e9cede022ebac0a9bebea67c3f9969b3bfa95af9cf48e4f8a9b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l3packages-doc"
RDEPENDS:${PN} += ""

inherit rpm
