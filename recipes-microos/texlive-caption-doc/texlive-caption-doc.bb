SUMMARY = "Documentation for texlive-caption"
DESCRIPTION = "This package includes the documentation for texlive-caption"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66580"

RPM_NAME = "texlive-caption-doc-2023.201.svn66580-52.1.noarch.rpm"
RPM_HASH = "2d3278bc711d9c77fc4840ed01667df2d8bcc3b03b219fce5e02bb57c877e0fd723c93478708813a78e55fe3539ad587bfe930b39feededa37b140c4e38cf537"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-caption-doc:en) \
texlive-caption-doc"
RDEPENDS:${PN} += ""

inherit rpm
