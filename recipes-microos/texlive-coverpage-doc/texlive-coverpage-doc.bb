SUMMARY = "Documentation for texlive-coverpage"
DESCRIPTION = "This package includes the documentation for texlive-coverpage"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.01svn63509"

RPM_NAME = "texlive-coverpage-doc-2023.204.1.01svn63509-54.1.noarch.rpm"
RPM_HASH = "4f2f30591f337561c028e12412066272ca9ac4add327cc59c6f342f7168051d7e093339494cb620a5f31962131209d0378f571c8c9505d9f51bf30966f26df52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coverpage-doc"
RDEPENDS:${PN} += ""

inherit rpm
