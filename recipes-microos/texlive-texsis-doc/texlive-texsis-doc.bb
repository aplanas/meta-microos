SUMMARY = "Documentation for texlive-texsis"
DESCRIPTION = "This package includes the documentation for texlive-texsis"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.18svn45678"

RPM_NAME = "texlive-texsis-doc-2023.201.2.18svn45678-54.1.noarch.rpm"
RPM_HASH = "a581339772e82c6e8bd19ee040b277c53ab211d3ede7f8d08826519af34a53f8123c186d25d53d5c862f64f17ff01feb20f6d7f1658057969d92260cae338b56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(texsis.1) texlive-texsis-doc"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
