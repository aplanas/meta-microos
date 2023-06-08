SUMMARY = "Documentation for texlive-skeycommand"
DESCRIPTION = "This package includes the documentation for texlive-skeycommand"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn24652"

RPM_NAME = "texlive-skeycommand-doc-2023.201.0.0.4svn24652-57.1.noarch.rpm"
RPM_HASH = "bdb370690842d5b61a5cf20e08426f5f48fad65564fd6cf57764fd4fff3ad1ecd18ef209c755bac4b77651b28e22656a1f303fd66c56d951def84150ee7c2da3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skeycommand-doc"
RDEPENDS:${PN} += ""

inherit rpm
