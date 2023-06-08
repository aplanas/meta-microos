SUMMARY = "Documentation for texlive-mflogo-font"
DESCRIPTION = "This package includes the documentation for texlive-mflogo-font"
LICENSE = "SUSE-TeX"

PV = "2023.201.1.002svn54512"

RPM_NAME = "texlive-mflogo-font-doc-2023.201.1.002svn54512-54.1.noarch.rpm"
RPM_HASH = "1320d64f734fc952948dc63365967df9c829b1d23bd823fc4c107b6a65669aea6c537bde004eb6d6c00c0d6689005da4c354c40ce34ed8fa4cef8ff5fdf8dd53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mflogo-font-doc"
RDEPENDS:${PN} += ""

inherit rpm
