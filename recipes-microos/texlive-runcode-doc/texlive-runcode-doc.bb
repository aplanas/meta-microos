SUMMARY = "Documentation for texlive-runcode"
DESCRIPTION = "This package includes the documentation for texlive-runcode"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn65588"

RPM_NAME = "texlive-runcode-doc-2023.201.1.8svn65588-53.1.noarch.rpm"
RPM_HASH = "39646275079ea5e31eacf713ff4d5b7e8800268f185a1bc002a54be2d6d336620dc97b4fbf3c8049308f88a80855471f82b8e9781cbcd64c0aafaf744f26bb6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-runcode-doc"
RDEPENDS:${PN} += ""

inherit rpm
