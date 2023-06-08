SUMMARY = "Documentation for texlive-dateiliste"
DESCRIPTION = "This package includes the documentation for texlive-dateiliste"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.6svn27974"

RPM_NAME = "texlive-dateiliste-doc-2023.204.0.0.6svn27974-54.1.noarch.rpm"
RPM_HASH = "83e18b1dec3a6eb2921d10ae5594427fb1f7e254230882dc9b6597e0ddad346538d9a3ff711338344308ff6458b4f8630ef5676136b0b731cbaf575e0077f642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-dateiliste-doc:de;en;eo) texlive-dateiliste-doc"
RDEPENDS:${PN} += ""

inherit rpm
