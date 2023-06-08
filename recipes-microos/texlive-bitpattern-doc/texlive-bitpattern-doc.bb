SUMMARY = "Documentation for texlive-bitpattern"
DESCRIPTION = "This package includes the documentation for texlive-bitpattern"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn39073"

RPM_NAME = "texlive-bitpattern-doc-2023.201.svn39073-52.1.noarch.rpm"
RPM_HASH = "b82d7510b9360fa64d38602fae3ba2d124fcfd64ddae1cdef8743ebe55ea146e0f5669f737bc95e6a5cf0f6d23727a49985e3050766899c413631efc48a59f16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bitpattern-doc"
RDEPENDS:${PN} += ""

inherit rpm
