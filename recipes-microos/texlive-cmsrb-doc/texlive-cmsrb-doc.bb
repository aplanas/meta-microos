SUMMARY = "Documentation for texlive-cmsrb"
DESCRIPTION = "This package includes the documentation for texlive-cmsrb"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.0svn54706"

RPM_NAME = "texlive-cmsrb-doc-2023.201.4.0svn54706-53.1.noarch.rpm"
RPM_HASH = "461d84f963b8ad9b542131d12ae127b351edff2fbf6c35c05112607ae528bfa3d13617c221098df29266cf0dc6ff8ac835d18bf87ef4654ee95f6941c489c6fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-cmsrb-doc:sr) texlive-cmsrb-doc"
RDEPENDS:${PN} += ""

inherit rpm
