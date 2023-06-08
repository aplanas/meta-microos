SUMMARY = "Documentation for texlive-identkey"
DESCRIPTION = "This package includes the documentation for texlive-identkey"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.1.0svn61719"

RPM_NAME = "texlive-identkey-doc-2023.201.0.0.1.0svn61719-52.1.noarch.rpm"
RPM_HASH = "ec9fc2d2034b0293293c79272a99c5357d2a27123ae882d67446bd67730165617373b92706a10a32a93ae0f2ef62626fa916789aa3147ef3be9603bc10077c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-identkey-doc"
RDEPENDS:${PN} += ""

inherit rpm
