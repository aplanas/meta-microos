SUMMARY = "Documentation for texlive-penlight"
DESCRIPTION = "This package includes the documentation for texlive-penlight"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64811"

RPM_NAME = "texlive-penlight-doc-2023.201.svn64811-51.1.noarch.rpm"
RPM_HASH = "66e6c0488ab8eba21e54ae9dc9b81eb62f8f507c41c209e2e3cfff163359c05ae45358ba5f8532ca571333e905e95c1c435e3f43bc7f8aaf7584ba83f25e0690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-penlight-doc"
RDEPENDS:${PN} += ""

inherit rpm
