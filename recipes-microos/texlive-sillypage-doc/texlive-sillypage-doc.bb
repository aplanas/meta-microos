SUMMARY = "Documentation for texlive-sillypage"
DESCRIPTION = "This package includes the documentation for texlive-sillypage"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn66349"

RPM_NAME = "texlive-sillypage-doc-2023.201.1.6svn66349-53.1.noarch.rpm"
RPM_HASH = "fad5c5b6e5d06822f82191ea94d6020181beb8deda404fc6b6b7a2a6db77e35aa9f287f57e9a7c05267938df636fbcbd00606776ace2ffe1464af4e6b4f85ca2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sillypage-doc"
RDEPENDS:${PN} += ""

inherit rpm
