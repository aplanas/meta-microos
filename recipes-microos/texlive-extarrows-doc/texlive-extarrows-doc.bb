SUMMARY = "Documentation for texlive-extarrows"
DESCRIPTION = "This package includes the documentation for texlive-extarrows"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.1.2.0svn54400"

RPM_NAME = "texlive-extarrows-doc-2023.201.1.2.0svn54400-52.1.noarch.rpm"
RPM_HASH = "bf67e000c388683b251dc48828c84291ddf75b3f7c61d95fcb533f02855999675b68b9df7cd81153e7f2306b21f6a0b07a33ef3fc9679a96f7bca626321cbb62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-extarrows-doc"
RDEPENDS:${PN} += ""

inherit rpm
