SUMMARY = "Documentation for texlive-umlaute"
DESCRIPTION = "This package includes the documentation for texlive-umlaute"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn15878"

RPM_NAME = "texlive-umlaute-doc-2023.201.2.1svn15878-53.1.noarch.rpm"
RPM_HASH = "3ad1bb91397e60e3fc4f6a1419a4e0f8223194e1a08532dc1ef4e9f14f572070322942879c6f998258ad6935fbf18bca0e3daa6aad004eb39541ef1207ef1c40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umlaute-doc"
RDEPENDS:${PN} += ""

inherit rpm
