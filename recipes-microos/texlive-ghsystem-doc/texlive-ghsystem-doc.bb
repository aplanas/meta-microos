SUMMARY = "Documentation for texlive-ghsystem"
DESCRIPTION = "This package includes the documentation for texlive-ghsystem"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.8csvn53822"

RPM_NAME = "texlive-ghsystem-doc-2023.201.4.8csvn53822-52.1.noarch.rpm"
RPM_HASH = "c22bdaf2e432dc14cdced5b49d0bfe62a4bdb2fe13999e0147871163bc6474fc4777f256cdfb985c031b75b2e7162ad03e207984f38a13010d9d3d70d227b389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ghsystem-doc"
RDEPENDS:${PN} += ""

inherit rpm
