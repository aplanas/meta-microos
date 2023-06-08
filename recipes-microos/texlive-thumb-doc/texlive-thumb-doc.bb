SUMMARY = "Documentation for texlive-thumb"
DESCRIPTION = "This package includes the documentation for texlive-thumb"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn16549"

RPM_NAME = "texlive-thumb-doc-2023.201.1.0svn16549-54.1.noarch.rpm"
RPM_HASH = "5347bb5575088345263489ebdc361d5049d907fdac72ac4a9f6cfa85e68a90216a75771a521a686abbdd2ac3d4454c9bbddef32adc467d963e04b2f5c0b04f07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thumb-doc"
RDEPENDS:${PN} += ""

inherit rpm
