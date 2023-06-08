SUMMARY = "Documentation for texlive-texlogfilter"
DESCRIPTION = "This package includes the documentation for texlive-texlogfilter"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn62792"

RPM_NAME = "texlive-texlogfilter-doc-2023.201.1.1svn62792-54.1.noarch.rpm"
RPM_HASH = "2902faf0d073dfabb6d638dc44c9ea51b7ede3c1387230b12611591b65a4bfd59e44427ea8e181b5f373f97b03c4fe91cd53244a7d0770cc2af0feab1a6804c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(texlogfilter.1) texlive-texlogfilter-doc"
RDEPENDS:${PN} += ""

inherit rpm
