SUMMARY = "Documentation for texlive-zxjatype"
DESCRIPTION = "This package includes the documentation for texlive-zxjatype"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn53500"

RPM_NAME = "texlive-zxjatype-doc-2023.201.0.0.7svn53500-52.1.noarch.rpm"
RPM_HASH = "c7d15f87e40952494c4bb5ca6832e291acd1630876df91c1ccc913d4e4d6d6c6978a9b2d86ddb39f0058f9c298df910d5fd1eeb90350db30a55df549b86f13fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-zxjatype-doc:ja) texlive-zxjatype-doc"
RDEPENDS:${PN} += ""

inherit rpm
