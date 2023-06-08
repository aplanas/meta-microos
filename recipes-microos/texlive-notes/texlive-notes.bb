SUMMARY = "Mark sections of a document"
DESCRIPTION = "The package provides environments to highlight significant \
portions of text within a document, by putting the text in a \
box and adding an icon in the margin. (The icons are provided \
as 'fig' sources, processable by xfig.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn42428"

RPM_NAME = "texlive-notes-2023.201.1.0.1svn42428-54.1.noarch.rpm"
RPM_HASH = "b71d394a8d95f5d8f468766db6377cf2cf5e85aadb7cb8160dd423dc88b5d6f5f88c7ac98f469e5b17dd158acd1598018f85d202c802a684e99849a2de18a91c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(notes.sty) texlive-notes"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(graphics.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
