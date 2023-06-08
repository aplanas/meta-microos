SUMMARY = "Documentation for texlive-method"
DESCRIPTION = "This package includes the documentation for texlive-method"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0bsvn17485"

RPM_NAME = "texlive-method-doc-2023.201.2.0bsvn17485-54.1.noarch.rpm"
RPM_HASH = "ec59386613cc2425792b117ca3d723f058c81acf9d647f65e5819d5793a04b046b9fcad6126a197eaef24f8e97ff5a38f430dc6be2500f9828961de45517d654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-method-doc"
RDEPENDS:${PN} += ""

inherit rpm
