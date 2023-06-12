SUMMARY = "Flexible Captioning and Deferred Box/List Printing"
DESCRIPTION = "The package allows the user to optimise presentation of LaTeX \
tables and figures. Boxhandler will lay out table and figure \
captions with a variety of stylistic apperances, and will also \
allow figures and tables to be 'wrapped' in a manner consistent \
with many business and government documents. For a document \
that might appear in different venues with different \
formatting, boxhandler permits the creation of a LaTeX source \
document that can, with a single-line change in the source \
code, produce an output that has very different layout from the \
baseline configuration, not only in terms of caption style, but \
more importantly in terms of the locations where figures, \
tables and lists appear (or not) in the document. Deferral \
routines also allow one to keep all figure and table data in a \
separate source file, while nonetheless producing a document \
with figures and tables appearing in the desired location."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.30svn28031"

RPM_NAME = "texlive-boxhandler-2023.201.1.30svn28031-52.1.noarch.rpm"
RPM_HASH = "c013e817506570b9568bda6c6e549253621a4b1be6731b639656fa375fa2ed5515d900d7d7886cdc0480168a3121b93a49fd189513b4da5323778258a0f70945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(boxhandler.sty) \
texlive-boxhandler"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(pbox.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
