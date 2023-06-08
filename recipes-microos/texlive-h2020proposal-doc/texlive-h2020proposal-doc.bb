SUMMARY = "Documentation for texlive-h2020proposal"
DESCRIPTION = "This package includes the documentation for texlive-h2020proposal"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn38428"

RPM_NAME = "texlive-h2020proposal-doc-2023.201.1.0svn38428-53.1.noarch.rpm"
RPM_HASH = "c6fd28e940e55d1bc53b2a0d2c30cd6eb6c55dd1d63c0dbb0b43507ab742d224244b5515c575bb1f565048e4103d5acbfcf1502d6b10ca70f377646e9a6bf774"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-h2020proposal-doc"
RDEPENDS:${PN} += ""

inherit rpm
