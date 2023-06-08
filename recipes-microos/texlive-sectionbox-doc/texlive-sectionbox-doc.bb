SUMMARY = "Documentation for texlive-sectionbox"
DESCRIPTION = "This package includes the documentation for texlive-sectionbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn37749"

RPM_NAME = "texlive-sectionbox-doc-2023.201.1.01svn37749-53.1.noarch.rpm"
RPM_HASH = "0549e1945219d2bcf2850c66ea5f79d6bde8c17652d161af33a908b3231d653348212e8f7190b33485820234df3ac07410154deda89a310064ef4e383fa894ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sectionbox-doc"
RDEPENDS:${PN} += ""

inherit rpm
