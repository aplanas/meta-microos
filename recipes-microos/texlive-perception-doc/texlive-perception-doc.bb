SUMMARY = "Documentation for texlive-perception"
DESCRIPTION = "This package includes the documentation for texlive-perception"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn48861"

RPM_NAME = "texlive-perception-doc-2023.201.svn48861-51.1.noarch.rpm"
RPM_HASH = "196976ab60bdcac331b18c9ebdb94766e4cee4d2a62bc42694e8c8b0a908e5e22cd4a8f9e0a648827592475e548925e8ba365bdee3c4261faf566719f88d4c3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-perception-doc"
RDEPENDS:${PN} += ""

inherit rpm
