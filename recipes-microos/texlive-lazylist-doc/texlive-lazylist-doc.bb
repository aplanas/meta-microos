SUMMARY = "Documentation for texlive-lazylist"
DESCRIPTION = "This package includes the documentation for texlive-lazylist"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn17691"

RPM_NAME = "texlive-lazylist-doc-2023.201.1.0asvn17691-54.1.noarch.rpm"
RPM_HASH = "db8f6473efa13b07967b3c3134b9b9ec820db6ede505a8f1fc4227cc1b20c6ebe585205d204a6c946d103dc6606f3750a645e387455c2cd548f559e7bf75aec4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lazylist-doc"
RDEPENDS:${PN} += ""

inherit rpm
