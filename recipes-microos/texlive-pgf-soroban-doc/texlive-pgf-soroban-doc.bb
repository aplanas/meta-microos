SUMMARY = "Documentation for texlive-pgf-soroban"
DESCRIPTION = "This package includes the documentation for texlive-pgf-soroban"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn32269"

RPM_NAME = "texlive-pgf-soroban-doc-2023.201.1.1svn32269-51.1.noarch.rpm"
RPM_HASH = "ed0874ed144a9cb4b3454f674ea1d93b9707625da2dce3934c72cab0c0aef26e18a240c33c67ef808eb7360bfb55000e65717777375fa9f9a19a117e1c56f813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-soroban-doc"
RDEPENDS:${PN} += ""

inherit rpm
