SUMMARY = "Documentation for texlive-fileinfo"
DESCRIPTION = "This package includes the documentation for texlive-fileinfo"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.81asvn28421"

RPM_NAME = "texlive-fileinfo-doc-2023.201.0.0.81asvn28421-52.1.noarch.rpm"
RPM_HASH = "95e1d0c08be66900698385c8b0f137d22b923218b9ba76c0ea974f82328492273bd9fff4511eff3431d1b67338f309a8cbad1bc5d76da6d54d5f089f6fd85ecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fileinfo-doc"
RDEPENDS:${PN} += ""

inherit rpm
