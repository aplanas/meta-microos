SUMMARY = "Documentation for texlive-datetime2-scottish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-scottish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn52101"

RPM_NAME = "texlive-datetime2-scottish-doc-2023.201.1.1svn52101-52.1.noarch.rpm"
RPM_HASH = "84500dd2e0e85674fef3bf37c3ac8bcf71287f29ee84010ea93418afa20fc59fbf9cd88b83b9f644647e88c61cfba55270fbf43b9e2653f5ea3ddd29e5a0a9ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-scottish-doc"
RDEPENDS:${PN} += ""

inherit rpm
