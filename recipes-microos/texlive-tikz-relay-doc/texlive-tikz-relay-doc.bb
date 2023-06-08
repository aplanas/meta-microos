SUMMARY = "Documentation for texlive-tikz-relay"
DESCRIPTION = "This package includes the documentation for texlive-tikz-relay"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn64072"

RPM_NAME = "texlive-tikz-relay-doc-2023.201.1.3svn64072-52.1.noarch.rpm"
RPM_HASH = "8ba7f5fb068989b953489d0def0a43a05393f832fb129614ba04f76deb5a8424514e576123acf9090ab5ff0352a4eb86ce1e6b2db19bf9d803d301f4eefe479e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-relay-doc"
RDEPENDS:${PN} += ""

inherit rpm
