SUMMARY = "Documentation for texlive-lt3luabridge"
DESCRIPTION = "This package includes the documentation for texlive-lt3luabridge"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.2svn64801"

RPM_NAME = "texlive-lt3luabridge-doc-2023.201.2.0.2svn64801-52.1.noarch.rpm"
RPM_HASH = "452c4b6ff5f5469074a6e8d16abfa79c8abfe62f595a37fbbfd9a235328540485829eb364b2a578424fbccb0fdc04272701ebc754d287ecb830cbc31552d1ef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lt3luabridge-doc"
RDEPENDS:${PN} += ""

inherit rpm
