SUMMARY = "Documentation for texlive-ibygrk"
DESCRIPTION = "This package includes the documentation for texlive-ibygrk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.5svn15878"

RPM_NAME = "texlive-ibygrk-doc-2023.201.4.5svn15878-52.1.noarch.rpm"
RPM_HASH = "0e38582d2de93c0e4712b565d02f579f6207bcb52969d5fb9288320e3e0a894959bb3f65cfbf653326df9c0d340f54b4a590db5e04769dd62fa716c7518e770a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ibygrk-doc"
RDEPENDS:${PN} += ""

inherit rpm
