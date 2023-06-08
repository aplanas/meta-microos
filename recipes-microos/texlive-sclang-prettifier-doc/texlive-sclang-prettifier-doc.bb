SUMMARY = "Documentation for texlive-sclang-prettifier"
DESCRIPTION = "This package includes the documentation for texlive-sclang-prettifier"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn35087"

RPM_NAME = "texlive-sclang-prettifier-doc-2023.201.0.0.1svn35087-53.1.noarch.rpm"
RPM_HASH = "739df3c76c4d834121f9cdb669dca0fbe93e6c1f5f586369e79761b8aa11f5115202419567d96a9a35aa2b6d445ad5b64ad7202ce3cad6f7ff924364b41dafbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sclang-prettifier-doc"
RDEPENDS:${PN} += ""

inherit rpm
