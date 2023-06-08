SUMMARY = "German variants of standard BibTeX styles"
DESCRIPTION = "A development of the (old) german.sty, this bundle provides \
German packages, BibTeX styles and documentary examples, for \
writing documents with bibliographies. The author has since \
developed the babelbib bundle, which (he asserts) supersedes \
germbib."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-germbib-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "b702c3e15f7e7c6568ae088932c1e3f978e2f0f4bf8e36a171e06d50a979b0b65ef0e58b44f079505b853da895b32997c1a7a1940a238e4f5fd8debd0f4c970a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bibgerm.sty) tex(mynormal.sty) texlive-germbib"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(german.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
