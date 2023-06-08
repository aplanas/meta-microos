SUMMARY = "Documentation for texlive-fbox"
DESCRIPTION = "This package includes the documentation for texlive-fbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.06svn62126"

RPM_NAME = "texlive-fbox-doc-2023.201.0.0.06svn62126-52.1.noarch.rpm"
RPM_HASH = "e111c9579d255c198bdcfcf9c9ce2bb0ce9a07f2e16390c24a93084b2d12787de9ec89e3a806e08b9ae7d86af90572182d759dc473efbb6a164ceb4eef5a66ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fbox-doc"
RDEPENDS:${PN} += ""

inherit rpm
