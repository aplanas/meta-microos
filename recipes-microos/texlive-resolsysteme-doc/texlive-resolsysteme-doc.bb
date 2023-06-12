SUMMARY = "Documentation for texlive-resolsysteme"
DESCRIPTION = "This package includes the documentation for texlive-resolsysteme"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.5svn66192"

RPM_NAME = "texlive-resolsysteme-doc-2023.201.0.0.1.5svn66192-53.1.noarch.rpm"
RPM_HASH = "d48045030144e1a05ccf42bbf3086cd20e6b5983e2ccf03396c5b8290bef3588352f5ea3ea2b120efa1b48bee7001577958ac00293cceaf52dcb65ca7d416920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-resolsysteme-doc:fr) \
texlive-resolsysteme-doc"
RDEPENDS:${PN} += ""

inherit rpm
