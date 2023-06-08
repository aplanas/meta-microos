SUMMARY = "Documentation for texlive-huawei"
DESCRIPTION = "This package includes the documentation for texlive-huawei"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.15.0svn65264"

RPM_NAME = "texlive-huawei-doc-2023.201.0.0.15.0svn65264-52.1.noarch.rpm"
RPM_HASH = "0fd740cd3e9cbbfadfe4929be20954ae1e41ab6f73f5d7453f81c49a688823b1ee02d658a96bd6d430708efe81e64a757a99596fbabc5b885aa7e5bdc96fe129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-huawei-doc"
RDEPENDS:${PN} += ""

inherit rpm
