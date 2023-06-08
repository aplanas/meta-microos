SUMMARY = "Patches the endnotes package to create hypertext links to the correct anchors"
DESCRIPTION = "The package supports the creation of hypertext links in support \
of the endnotes package. The package modifies the syntax of the \
\\endnote command: \\endnote*[<num>]{<text>}\\label{<name>}. When \
the *-option is used, no endnote mark is created, but the \
endnote itself is written. The \\label command appears at the \
end of the \\endnote and its arguments, rather than within the \
argument of the <text> argument."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54758"

RPM_NAME = "texlive-endnotes-hy-2023.201.svn54758-53.1.noarch.rpm"
RPM_HASH = "1ff6fd18f45abaeba92e6e111042c0901815bce3a218e73797ceaadda1850cab5e26e8e75b8019080641d95ca70fe2998e0eb2a55511e7fc806f53cd4c965a41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(endnotes-hy.sty) texlive-endnotes-hy"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(endnotes.sty) tex(etoolbox.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
