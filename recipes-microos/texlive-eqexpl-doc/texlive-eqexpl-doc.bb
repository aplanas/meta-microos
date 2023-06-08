SUMMARY = "Documentation for texlive-eqexpl"
DESCRIPTION = "This package includes the documentation for texlive-eqexpl"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn63629"

RPM_NAME = "texlive-eqexpl-doc-2023.201.1.1.1svn63629-53.1.noarch.rpm"
RPM_HASH = "e61e6038a06abc97fd1f18696ac40440572f85e2d885ac8e6afa7de9a7834f0a50df37427caa0a60a2c10730ccfe4433cc15f9dcddf9939a92e82a0e0a0c7931"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-eqexpl-doc:ru) texlive-eqexpl-doc"
RDEPENDS:${PN} += ""

inherit rpm
