SUMMARY = "Documentation for texlive-byo-twemojis"
DESCRIPTION = "This package includes the documentation for texlive-byo-twemojis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn58917"

RPM_NAME = "texlive-byo-twemojis-doc-2023.201.1.0svn58917-52.1.noarch.rpm"
RPM_HASH = "5719384914125448a8b1b8fcbe0296f88d89ee55765698a33879775ff72c97348c21f4d9dbce7074f3dd881b5d3509083976b312fa5e17264b338bbc8e057690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-byo-twemojis-doc"
RDEPENDS:${PN} += ""

inherit rpm
