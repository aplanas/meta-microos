SUMMARY = "Documentation for texlive-lexend"
DESCRIPTION = "This package includes the documentation for texlive-lexend"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0.70svn57564"

RPM_NAME = "texlive-lexend-doc-2023.201.1.1.0.70svn57564-54.1.noarch.rpm"
RPM_HASH = "6a589ede4099ba8ef984a2ee030792a8c92ed869187f11108cf101720666c4c2a1c96de52004b4653a2d7c760432810c9753d059f720a8955926fee1caac9a4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lexend-doc"
RDEPENDS:${PN} += ""

inherit rpm
