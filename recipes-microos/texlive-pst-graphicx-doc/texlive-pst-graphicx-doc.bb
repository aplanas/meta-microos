SUMMARY = "Documentation for texlive-pst-graphicx"
DESCRIPTION = "This package includes the documentation for texlive-pst-graphicx"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn21717"

RPM_NAME = "texlive-pst-graphicx-doc-2023.201.0.0.02svn21717-52.1.noarch.rpm"
RPM_HASH = "afcc9053cdb9a4b06f646b2d2599d851fe09db5a1da186f4ede30c969dbaa126a2c60df9109a2b8c2d9708c77f85d0fe767e6156a08105578ab2060e988084c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-graphicx-doc"
RDEPENDS:${PN} += ""

inherit rpm
