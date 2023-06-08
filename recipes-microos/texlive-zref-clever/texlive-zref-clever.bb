SUMMARY = "Clever LaTeX cross-references based on zref"
DESCRIPTION = "This package provides a user interface for making LaTeX \
cross-references which automates some of their typical \
features, thus easing their input in the document and improving \
the consistency of typeset results. A reference made with \
\\zcref includes a 'name' according to its 'type', and lists of \
multiple labels can be automatically sorted and compressed into \
ranges when due. The reference format is highly and easily \
customizable, both globally and locally. The package is based \
on zref's extensible referencing system."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.6svn66021"

RPM_NAME = "texlive-zref-clever-2023.201.0.0.3.6svn66021-52.1.noarch.rpm"
RPM_HASH = "8419bbaf0f561fda318963ba907232ef12b1f41def1dd71b085b5679a27c37a61f4f9eb1c0d1c1a3158de9ee44d39b30feeb3e0bf71659443f361194a4ab5a89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(zref-clever.sty) texlive-zref-clever"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifdraft.sty) tex(zref-abspage.sty) tex(zref-base.sty) tex(zref-hyperref.sty) tex(zref-user.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
