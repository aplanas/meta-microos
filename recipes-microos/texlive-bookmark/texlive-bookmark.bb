SUMMARY = "A new bookmark (outline) organization for hyperref"
DESCRIPTION = "This package implements a new bookmark (outline) organization \
for package hyperref. Bookmark properties such as style and \
color can now be set. Other action types are available (URI, \
GoToR, Named). The bookmarks are generated in the first compile \
run. Package hyperref uses two runs."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.29svn56885"

RPM_NAME = "texlive-bookmark-2023.201.1.29svn56885-52.1.noarch.rpm"
RPM_HASH = "bb3a0da7e195359b5344ac96846489eae20d82fc007b9875cc3efb8c7f8857b517ceb8468668787422272ebe7bc1e93277570fd023ccfa455a5eec785a7241b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bkm-dvipdfm-2019-12-03.def) tex(bkm-dvipdfm.def) tex(bkm-dvips-2019-12-03.def) tex(bkm-dvips.def) tex(bkm-pdftex-2019-12-03.def) tex(bkm-pdftex.def) tex(bkm-vtex-2019-12-03.def) tex(bkm-vtex.def) tex(bookmark.sty) texlive-bookmark"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(atenddvi.sty) tex(atveryend.sty) tex(auxhook.sty) tex(hyperref.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
