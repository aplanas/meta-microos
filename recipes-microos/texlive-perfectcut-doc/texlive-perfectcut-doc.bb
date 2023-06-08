SUMMARY = "Documentation for texlive-perfectcut"
DESCRIPTION = "This package includes the documentation for texlive-perfectcut"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3svn54080"

RPM_NAME = "texlive-perfectcut-doc-2023.201.2.3svn54080-51.1.noarch.rpm"
RPM_HASH = "f1967b0afec0114c910125fa68b2ea41b84f38d6216a0546059530ec3d047e6c2513b2f91c3add7307c392a386cd28b8e51fde07e587e0cd25b2ed4c0c00c26e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-perfectcut-doc"
RDEPENDS:${PN} += ""

inherit rpm
