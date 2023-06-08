SUMMARY = "Documentation for texlive-exteps"
DESCRIPTION = "This package includes the documentation for texlive-exteps"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.41svn19859"

RPM_NAME = "texlive-exteps-doc-2023.201.0.0.41svn19859-52.1.noarch.rpm"
RPM_HASH = "f0b3ef4e5825b32b9192561deb231f2438d3a9ba46e9a796ee887f886f222fcb45356b03a2d55293033a72719d5ec2b83d939736ec9eb5b54014b4246de766f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exteps-doc"
RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
