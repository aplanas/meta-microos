SUMMARY = "Documentation for texlive-exp-testopt"
DESCRIPTION = "This package includes the documentation for texlive-exp-testopt"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn15878"

RPM_NAME = "texlive-exp-testopt-doc-2023.201.0.0.3svn15878-52.1.noarch.rpm"
RPM_HASH = "60cc8b2277fc03aa9eeeadf5580595d17deda942f6d82d503a192fc249c27775b13adb15656d0de46d1ce511a7c7f3d9a6b62f40748f4597b9df5f3369935e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-exp-testopt-doc:en;eo) \
texlive-exp-testopt-doc"
RDEPENDS:${PN} += ""

inherit rpm
