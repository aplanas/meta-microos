SUMMARY = "Documentation for texlive-beamerswitch"
DESCRIPTION = "This package includes the documentation for texlive-beamerswitch"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9svn64182"

RPM_NAME = "texlive-beamerswitch-doc-2023.201.1.9svn64182-53.1.noarch.rpm"
RPM_HASH = "7c5eb17f89b6e8b838e9795740e494e1b19cc7d799cf7d5918eeae18333b6d35c0a077315f5f5e326a662000245dc1f4ec2427ec5b921980169e8e0badd23299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerswitch-doc"
RDEPENDS:${PN} += ""

inherit rpm
