SUMMARY = "Documentation for texlive-quicktype"
DESCRIPTION = "This package includes the documentation for texlive-quicktype"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn42183"

RPM_NAME = "texlive-quicktype-doc-2023.201.0.0.1svn42183-53.1.noarch.rpm"
RPM_HASH = "99323f89454f13d409d183795051d937128934e6a199fda78375ce9b65cde2299115373ebad0780025336d19411b91476748a5a729f63c8f813f569a15bcc03b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quicktype-doc"
RDEPENDS:${PN} += ""

inherit rpm
