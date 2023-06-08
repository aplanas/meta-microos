SUMMARY = "Documentation for texlive-baskervald"
DESCRIPTION = "This package includes the documentation for texlive-baskervald"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.016svn19490"

RPM_NAME = "texlive-baskervald-doc-2023.201.1.016svn19490-53.1.noarch.rpm"
RPM_HASH = "56cb094e5ec7f7100bfe52ee11d1abd22962387e6489b8802ce8ebe5f2379f79fc02f36f3291105e09ebe2366506f5d943a7b65b1e430044099a6956279fbe8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-baskervald-doc"
RDEPENDS:${PN} += ""

inherit rpm
