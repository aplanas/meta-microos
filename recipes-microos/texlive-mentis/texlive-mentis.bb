SUMMARY = "A basis for books to be published by Mentis publishers"
DESCRIPTION = "This LaTeX class loads scrbook and provides changes necessary \
for publishing at Mentis publishers in Paderborn, Germany. It \
is not an official Mentis class, merely one developed by an \
author in close co-operation with Mentis."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-mentis-2023.201.1.5svn15878-52.1.noarch.rpm"
RPM_HASH = "4c9097ef1cf54ec1d4c05251e9f5c614600be7c4a3a96b91d7e465af502c148c843fdfeebc4e00499bb4aede9b8ffa9a15dbf4c98138b447e2ff6a0df2e820f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mentis.cls) texlive-mentis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(babel.sty) tex(fontenc.sty) tex(geometry.sty) tex(jurabib.sty) tex(makeidx.sty) tex(microtype.sty) tex(multicol.sty) tex(ragged2e.sty) tex(relsize.sty) tex(textcomp.sty) tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
