SUMMARY = "Documentation for texlive-zref-clever"
DESCRIPTION = "This package includes the documentation for texlive-zref-clever"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.6svn66021"

RPM_NAME = "texlive-zref-clever-doc-2023.201.0.0.3.6svn66021-52.1.noarch.rpm"
RPM_HASH = "cbdd47e30c032c0448920a75f076dc44b00d72a9f4426f6a06bd87eb7a2fac1ef3f13e31894d4e668af972e67f8352c34c8ee20411c1aee9a616ea2a3dfabcb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-clever-doc"
RDEPENDS:${PN} += ""

inherit rpm
