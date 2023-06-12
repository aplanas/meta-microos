SUMMARY = "Documentation for texlive-yazd-thesis"
DESCRIPTION = "This package includes the documentation for texlive-yazd-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn61719"

RPM_NAME = "texlive-yazd-thesis-doc-2023.201.0.0.3svn61719-52.1.noarch.rpm"
RPM_HASH = "92da0f9b01f1d55ebf41c84b10b2725fd3e20be4fe6dfa86a90dbf40b084912fe4711fcd9ca9f75ba1e35f87acaf9887e1251a06e7634c916b71ac5e060e6204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-yazd-thesis-doc:fa) \
texlive-yazd-thesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
