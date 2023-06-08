SUMMARY = "Documentation for texlive-wrapfig"
DESCRIPTION = "This package includes the documentation for texlive-wrapfig"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.6svn61719"

RPM_NAME = "texlive-wrapfig-doc-2023.201.3.6svn61719-52.1.noarch.rpm"
RPM_HASH = "b6cbf49f776007793bcd41e1a30a50ea80a3a1d1bf8aff2d2578e3f0454e1038eb56e8b82dc82487ceec6c37be31532f2df8b4797f4f6d88bd3051142221e01e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wrapfig-doc"
RDEPENDS:${PN} += ""

inherit rpm
