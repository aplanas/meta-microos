SUMMARY = "Documentation for texlive-matc3mem"
DESCRIPTION = "This package includes the documentation for texlive-matc3mem"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn35773"

RPM_NAME = "texlive-matc3mem-doc-2023.201.1.1svn35773-52.1.noarch.rpm"
RPM_HASH = "e4de0703c751b5572fff7198781940f8af66518e7b4bd0e6694612bd43f9bf96754dd8155e283565ca1c5d201f4c4270b20a655046d0870c699c603c637c7aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-matc3mem-doc:it) texlive-matc3mem-doc"
RDEPENDS:${PN} += ""

inherit rpm
