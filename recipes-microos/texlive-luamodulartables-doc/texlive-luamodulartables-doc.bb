SUMMARY = "Documentation for texlive-luamodulartables"
DESCRIPTION = "This package includes the documentation for texlive-luamodulartables"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65485"

RPM_NAME = "texlive-luamodulartables-doc-2023.201.1.0svn65485-52.1.noarch.rpm"
RPM_HASH = "8a06174b489a2fa536710af3389bba2aa4d53b1397d5e84212eb1b891363c5fa81c96d338661ff89c8321494d48808d6abd9aa55d2efff45d2b3a62724b56d83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamodulartables-doc"
RDEPENDS:${PN} += ""

inherit rpm
