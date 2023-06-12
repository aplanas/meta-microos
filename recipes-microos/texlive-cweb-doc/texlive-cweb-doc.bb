SUMMARY = "Documentation for texlive-cweb"
DESCRIPTION = "This package includes the documentation for texlive-cweb"
LICENSE = "SUSE-TeX"

PV = "2023.204.svn66186"

RPM_NAME = "texlive-cweb-doc-2023.204.svn66186-54.1.noarch.rpm"
RPM_HASH = "05dc234943970a993fae8c2b1546b8f24ebcd00eb59ebd552599e8cc47fdc8cb8a4b0dd67097cf05fd2407daf5e15c00b56c63aef539fd2c982a70580da1827c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(ctangle.1) \
man(ctwill-refsort.1) \
man(ctwill-twinx.1) \
man(ctwill.1) \
man(cweave.1) \
man(cweb.1) \
man(twill.1) \
texlive-cweb-doc"
RDEPENDS:${PN} += ""

inherit rpm
