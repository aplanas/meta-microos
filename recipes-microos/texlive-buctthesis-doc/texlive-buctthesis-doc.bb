SUMMARY = "Documentation for texlive-buctthesis"
DESCRIPTION = "This package includes the documentation for texlive-buctthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.1svn64004"

RPM_NAME = "texlive-buctthesis-doc-2023.201.1.4.1svn64004-52.1.noarch.rpm"
RPM_HASH = "d6d291f0c7525fac33e95e102bf403658c0cf05f29cc46314e78e29a08fe1434a0de17910f14ef00972be891f6c6e5195b1644b14375f673b4ee9e0699fa1003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-buctthesis-doc:zh) \
texlive-buctthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
