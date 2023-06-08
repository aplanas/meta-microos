SUMMARY = "Documentation for texlive-biblatex-caspervector"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-caspervector"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.6svn64866"

RPM_NAME = "texlive-biblatex-caspervector-doc-2023.201.0.0.3.6svn64866-53.1.noarch.rpm"
RPM_HASH = "6d7d1e99a822cfa57a3c788493fd26edecfaf18712ed87b0a1c8901334bb450a7822860d0721f505c1f7e21d770fc298440a7bfc47b5e82bfb40abf918ce5ef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-biblatex-caspervector-doc:zh) texlive-biblatex-caspervector-doc"
RDEPENDS:${PN} += ""

inherit rpm
