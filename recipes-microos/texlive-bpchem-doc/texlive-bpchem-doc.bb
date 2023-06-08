SUMMARY = "Documentation for texlive-bpchem"
DESCRIPTION = "This package includes the documentation for texlive-bpchem"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn45120"

RPM_NAME = "texlive-bpchem-doc-2023.201.1.1svn45120-52.1.noarch.rpm"
RPM_HASH = "6ece2dad69e94497485c4d862280e39981d62486756fc6c9940cd5bf94019c85ebe0b095bd16d1490b61c6a61ce4ead8ba1484937508b6b7ce2127e7314452b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bpchem-doc"
RDEPENDS:${PN} += ""

inherit rpm
