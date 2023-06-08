SUMMARY = "Documentation for texlive-sanskrit-t1"
DESCRIPTION = "This package includes the documentation for texlive-sanskrit-t1"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55475"

RPM_NAME = "texlive-sanskrit-t1-doc-2023.201.svn55475-53.1.noarch.rpm"
RPM_HASH = "c2cd6f40072573d6d3c365de72ae80c473d3b004bdf566d6e51a5387b1f6097d0cb63841d54c7b11f7c20394efa40ff1ddf7883c379ff1f41173533f0f7308ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sanskrit-t1-doc"
RDEPENDS:${PN} += ""

inherit rpm
