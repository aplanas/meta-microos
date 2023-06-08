SUMMARY = "Documentation for texlive-cprotect"
DESCRIPTION = "This package includes the documentation for texlive-cprotect"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0esvn21209"

RPM_NAME = "texlive-cprotect-doc-2023.204.1.0esvn21209-54.1.noarch.rpm"
RPM_HASH = "32f0600db8b72436ebe5e9ed7606082c8196a259c6cbce634912f700858b467de85ae051300f3b34a4d85af92236cb3232e1e628414faa12c66acafa72608085"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cprotect-doc"
RDEPENDS:${PN} += ""

inherit rpm
