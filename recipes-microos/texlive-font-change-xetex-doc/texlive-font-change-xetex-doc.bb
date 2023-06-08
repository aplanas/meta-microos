SUMMARY = "Documentation for texlive-font-change-xetex"
DESCRIPTION = "This package includes the documentation for texlive-font-change-xetex"
LICENSE = "LPPL-1.0"

PV = "2023.201.2016.1svn40404"

RPM_NAME = "texlive-font-change-xetex-doc-2023.201.2016.1svn40404-52.1.noarch.rpm"
RPM_HASH = "af87dfb74fe0ef1d73880372aa2bf8b6472418b5ca8329c55a4f64f2e91ba7b78a48885cc66fbcfa8b2e55212721d531c011d99fe5f99717b8429839c3776918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-font-change-xetex-doc"
RDEPENDS:${PN} += ""

inherit rpm
