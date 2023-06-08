SUMMARY = "Documentation for texlive-prooftrees"
DESCRIPTION = "This package includes the documentation for texlive-prooftrees"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7_svn_8641svn52221"

RPM_NAME = "texlive-prooftrees-doc-2023.201.0.0.7_svn_8641svn52221-52.1.noarch.rpm"
RPM_HASH = "dc98393ee6f2aadfe0e4ead0ed21487ee121372d3bdaafcfa2f858c91ab7de233d6d6432df8d7f10c84859457675a0e227c454f8a4d6c025908a04898f959922"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prooftrees-doc"
RDEPENDS:${PN} += ""

inherit rpm
