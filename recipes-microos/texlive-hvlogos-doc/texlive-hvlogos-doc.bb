SUMMARY = "Documentation for texlive-hvlogos"
DESCRIPTION = "This package includes the documentation for texlive-hvlogos"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.09svn63261"

RPM_NAME = "texlive-hvlogos-doc-2023.201.0.0.09svn63261-52.1.noarch.rpm"
RPM_HASH = "6bf6015d5057077ca6ced111eb063d82adc54d3eff112b672401abe8d83006ebec45869e1817efbe77f341b1a40d29a5c27971329941536624a35a3cd66b2ef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvlogos-doc"
RDEPENDS:${PN} += ""

inherit rpm
