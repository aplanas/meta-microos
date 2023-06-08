SUMMARY = "Documentation for texlive-turabian-formatting"
DESCRIPTION = "This package includes the documentation for texlive-turabian-formatting"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58561"

RPM_NAME = "texlive-turabian-formatting-doc-2023.201.svn58561-52.1.noarch.rpm"
RPM_HASH = "f9d6f29d41d5fb09e953a1a1aff9ba3747b7e806b140d2c6b2a9970d8209cd6a0984870571b87019e3ef69c69e279c5bbcb22dce26f580f09d1a0b404a126fcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-turabian-formatting-doc"
RDEPENDS:${PN} += ""

inherit rpm
