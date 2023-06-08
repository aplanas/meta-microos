SUMMARY = "Documentation for texlive-beamertheme-focus"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-focus"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.3.0svn62551"

RPM_NAME = "texlive-beamertheme-focus-doc-2023.201.3.3.0svn62551-53.1.noarch.rpm"
RPM_HASH = "426bc2654b23d045e225add6d98d1c0af454df29599eb6021071dbbaee98e189e12122afe5dddaf9e1e4ff76add1bf7bfbd35d23bbaccc5f0146382c8c84c190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-focus-doc"
RDEPENDS:${PN} += ""

inherit rpm
