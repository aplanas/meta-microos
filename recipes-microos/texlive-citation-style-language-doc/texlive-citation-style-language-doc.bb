SUMMARY = "Documentation for texlive-citation-style-language"
DESCRIPTION = "This package includes the documentation for texlive-citation-style-language"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn65878"

RPM_NAME = "texlive-citation-style-language-doc-2023.201.0.0.3.0svn65878-53.1.noarch.rpm"
RPM_HASH = "7e9051993be03dbb03ac43f814409e703f97fbc96740d14322a054926789f8815dbdd2f56059d6d82ab01297ef54d4ff02f87166ab5ee5870a64773f3d18fb77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(citeproc-lua.1) \
texlive-citation-style-language-doc"
RDEPENDS:${PN} += ""

inherit rpm
