SUMMARY = "Documentation for texlive-meetingmins"
DESCRIPTION = "This package includes the documentation for texlive-meetingmins"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn31878"

RPM_NAME = "texlive-meetingmins-doc-2023.201.1.6svn31878-52.1.noarch.rpm"
RPM_HASH = "49628fa462572ebe2becc4187187fe879742f50aef29c8314747c8205d7ff8555b7c05b9ee730e61e0e8acf8964419b282aaf579c657aaec503d086b4cf864a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-meetingmins-doc"
RDEPENDS:${PN} += ""

inherit rpm
