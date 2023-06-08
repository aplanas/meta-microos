SUMMARY = "Documentation for texlive-pst-spectra"
DESCRIPTION = "This package includes the documentation for texlive-pst-spectra"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn15878"

RPM_NAME = "texlive-pst-spectra-doc-2023.201.0.0.91svn15878-53.1.noarch.rpm"
RPM_HASH = "24acae74012d6c60e02ac0ff1bbf9b9165d7d90fa1edfc270dc3b0ff803f8816df7e0de8b6f621ba0fc1eab69592d97f8010119b6096f37a1d14b9649ee15a4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-spectra-doc:fr;en) texlive-pst-spectra-doc"
RDEPENDS:${PN} += ""

inherit rpm
