SUMMARY = "Documentation for texlive-termes-otf"
DESCRIPTION = "This package includes the documentation for texlive-termes-otf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn64733"

RPM_NAME = "texlive-termes-otf-doc-2023.201.0.0.02svn64733-54.1.noarch.rpm"
RPM_HASH = "6d70de9370b4f12cf4a1c6a19f4cf3ec62335f8b0ac489b4c9820aa67422843a8d38d1ee438ebfe32ffc4c919fe086c8c600b2f09b8d47bc184c008c212d952b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-termes-otf-doc"
RDEPENDS:${PN} += ""

inherit rpm
