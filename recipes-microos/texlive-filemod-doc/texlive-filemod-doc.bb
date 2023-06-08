SUMMARY = "Documentation for texlive-filemod"
DESCRIPTION = "This package includes the documentation for texlive-filemod"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn64967"

RPM_NAME = "texlive-filemod-doc-2023.201.1.2svn64967-52.1.noarch.rpm"
RPM_HASH = "e57937a5ed962d2b25124057254298ad118a017f740f050962fa2a2194e4867127df5575962e212b54c093e040fc11225b5c44a2d89f595e04f7ef0fa77adb58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-filemod-doc"
RDEPENDS:${PN} += ""

inherit rpm
