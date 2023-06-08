SUMMARY = "Documentation for texlive-pst-text"
DESCRIPTION = "This package includes the documentation for texlive-pst-text"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn49542"

RPM_NAME = "texlive-pst-text-doc-2023.201.1.02svn49542-53.1.noarch.rpm"
RPM_HASH = "dc35a61842e9300fcedd0b01e104ae5a9b86ebd3819530220bf7e1a4742eb899a9a265535d11d465f682e62dfa41e3e2ad38f940adb470b57a4d815917c3dc71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-text-doc"
RDEPENDS:${PN} += ""

inherit rpm
