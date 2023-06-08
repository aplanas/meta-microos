SUMMARY = "Documentation for texlive-gauss"
DESCRIPTION = "This package includes the documentation for texlive-gauss"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn32934"

RPM_NAME = "texlive-gauss-doc-2023.201.svn32934-52.1.noarch.rpm"
RPM_HASH = "5b8e505579d8b23e99a4d73a2a860ceb82071705d2e66bc7a60a9ab970eb241c8dbfb46c0f3d9694362299d69eafac446828a8eaee59fd6d53cf76d29a491e33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gauss-doc"
RDEPENDS:${PN} += ""

inherit rpm
