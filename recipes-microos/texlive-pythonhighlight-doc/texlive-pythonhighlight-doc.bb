SUMMARY = "Documentation for texlive-pythonhighlight"
DESCRIPTION = "This package includes the documentation for texlive-pythonhighlight"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn43191"

RPM_NAME = "texlive-pythonhighlight-doc-2023.201.svn43191-53.1.noarch.rpm"
RPM_HASH = "2695dbd8019edaa9caa6e7ff87eb8a8aef9388c90614058b55d61288ce30486ba53edbd06add68f8879443d4522537abe52e74376ca0cd8e9327f884e27207de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pythonhighlight-doc"
RDEPENDS:${PN} += ""

inherit rpm
