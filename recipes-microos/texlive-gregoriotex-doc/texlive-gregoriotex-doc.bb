SUMMARY = "Documentation for texlive-gregoriotex"
DESCRIPTION = "This package includes the documentation for texlive-gregoriotex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.6.0.0svn58331"

RPM_NAME = "texlive-gregoriotex-doc-2023.201.6.0.0svn58331-53.1.noarch.rpm"
RPM_HASH = "e169dacdb46d38aa1964a594fe693f4617fa5116138c479e7fea5f6a2e7fdd2ee56bcd7daead718c305f2ee09dd265ad5494237f0c3d0ce1d7822f57048575ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gregoriotex-doc"
RDEPENDS:${PN} += ""

inherit rpm
