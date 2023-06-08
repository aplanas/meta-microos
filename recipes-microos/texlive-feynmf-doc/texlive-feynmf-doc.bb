SUMMARY = "Documentation for texlive-feynmf"
DESCRIPTION = "This package includes the documentation for texlive-feynmf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.08svn17259"

RPM_NAME = "texlive-feynmf-doc-2023.201.1.08svn17259-52.1.noarch.rpm"
RPM_HASH = "901ff1dfa75355d310801c3278797d3993a99555a96883169f630d6c312908aa418a0ecf230965baddfa0365b70e3bd031dccb5a77663eb9097e94c9519242b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-feynmf-doc"
RDEPENDS:${PN} += ""

inherit rpm
