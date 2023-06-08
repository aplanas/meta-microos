SUMMARY = "Adds names to chapters, sections, figures in the TOC and LOF"
DESCRIPTION = "The tocdata package may be used to add a small amount of data \
to an entry in the table of contents or list of figures, \
between the section or caption name and the page number. The \
typical use would be to add the name of an author or artist of \
a chapter or section, such as in an anthology or a collection \
of papers. Additionally, user-level macros are provided which \
add the author's name to a chapter or section, along with an \
optional prefix and/or suffix, and add to a figure the artist's \
name, prefix, and suffix, plus optional additional text. Author \
and artist names are also added to the index. Additional \
user-level macros control formatting. tocdata works with the \
TOC/LOF formatting of the default LaTeX classes, memoir, \
koma-script, and with titletoc, tocloft, tocbasic, and \
tocstyle."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.05svn65451"

RPM_NAME = "texlive-tocdata-2023.201.2.05svn65451-52.1.noarch.rpm"
RPM_HASH = "0a16ad79ff9d895a6f3ffe43dae4b80f10ef156c4b471a419b7046bb7e8e6e52c2c5853c02ad3ff3cb691279c6b8df1a058c0d26f21cd99fbad53356291a4fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tocdata.sty) texlive-tocdata"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(titletoc.sty) tex(tocloft.sty) tex(xparse.sty) tex(xpatch.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
