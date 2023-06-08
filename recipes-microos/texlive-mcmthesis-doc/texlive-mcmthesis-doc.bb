SUMMARY = "Documentation for texlive-mcmthesis"
DESCRIPTION = "This package includes the documentation for texlive-mcmthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.6.3.1svn57333"

RPM_NAME = "texlive-mcmthesis-doc-2023.201.6.3.1svn57333-52.1.noarch.rpm"
RPM_HASH = "c3cae30ebecead5f68ee5a1ab8defcd16d075015d7d4fbf48104fb0c558fd780ea4d13ac39e3b0ee7f734a8135a1673d1ba2835f6b4b298081e664caee811521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) locale(texlive-mcmthesis-doc:zh texlive-mcmthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
