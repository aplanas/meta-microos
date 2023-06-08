SUMMARY = "Documentation for texlive-beamertheme-detlevcm"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-detlevcm"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.02svn39048"

RPM_NAME = "texlive-beamertheme-detlevcm-doc-2023.201.1.02svn39048-53.1.noarch.rpm"
RPM_HASH = "38658c3f20e7086fc1574a96335e320b0d41effb8fa35ba79c2ea4b0a7e9b0fbeca22be00d555ccf7ddf7df8502d3f05243828231f8402e80643267732b09e94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-detlevcm-doc"
RDEPENDS:${PN} += ""

inherit rpm
