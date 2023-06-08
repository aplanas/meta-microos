SUMMARY = "Documentation for texlive-fontinst"
DESCRIPTION = "This package includes the documentation for texlive-fontinst"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.933svn62517"

RPM_NAME = "texlive-fontinst-doc-2023.201.1.933svn62517-52.1.noarch.rpm"
RPM_HASH = "a49ecbe7200c11645eda322ba0b492eeac34231ccb280922b85ef1b24b6defe4800ecf33a74c8b7d0cf3adb992ab6631bd20cf4937c11647f8390f3deb0cd121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(fontinst.1) texlive-fontinst-doc"
RDEPENDS:${PN} += ""

inherit rpm
