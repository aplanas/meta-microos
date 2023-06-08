SUMMARY = "Documentation for texlive-pdfarticle"
DESCRIPTION = "This package includes the documentation for texlive-pdfarticle"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51127"

RPM_NAME = "texlive-pdfarticle-doc-2023.201.1.0svn51127-51.1.noarch.rpm"
RPM_HASH = "5f9f8062e164ecf64d4d13ce9346927e7272f4b6d32ad9f8db4b370ca614e74109e946bd96320e8165bb08450c70ea27db530c3c0125b0325ac3160dcaefb3a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfarticle-doc"
RDEPENDS:${PN} += ""

inherit rpm
