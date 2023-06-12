SUMMARY = "Tools for a repository of long-living documents"
DESCRIPTION = "The package provides macros that help to build a document \
repository for long living documents. It focuses on structure \
and re-use of text, code, figures etc. The basic concept is \
first to separate structure from content (i.e., text about a \
topic from the structure it is presented by) and then \
separating the content from the actual published document, thus \
enabling easy re-use of text blocks in different publications \
(i.e., text about a protocol in a short article about this \
protocol as well as in a book about many protocols); all \
without constantly copying or changing text. As a side effect, \
using the document classes provided, it hides a lot of LaTeX \
from someone who just wants to write articles and books."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.52svn22781"

RPM_NAME = "texlive-skb-2023.201.0.0.52svn22781-57.1.noarch.rpm"
RPM_HASH = "14f89ffcd7c634495888ec04ebec2b36b35d74b41cc130598d49c35fc4f707bd0f5cf8fb133966968fca1b0a5b6e217b0b973f99a4af4efa91041b4ec50e35b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(skb.cfg) \
tex(skb.sty) \
tex(skbarticle.cls) \
tex(skbbeamer.cls) \
tex(skbbook.cls) \
tex(skblncsbeamer.cls) \
tex(skblncsppt.cls) \
tex(skbmoderncv.cls) \
texlive-skb"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(acronym.sty) \
tex(beamer.cls) \
tex(beamerarticle.sty) \
tex(biblatex.sty) \
tex(booktabs.sty) \
tex(colortbl.sty) \
tex(comment.sty) \
tex(datetime.sty) \
tex(dirtree.sty) \
tex(enumitem.sty) \
tex(etoolbox.sty) \
tex(float.sty) \
tex(gensymb.sty) \
tex(graphicx.sty) \
tex(ifpdf.sty) \
tex(keyval.sty) \
tex(listings.sty) \
tex(longtable.sty) \
tex(memoir.cls) \
tex(moderncv.cls) \
tex(optional.sty) \
tex(pgf.sty) \
tex(textcomp.sty) \
tex(units.sty) \
tex(versions.sty) \
tex(wasysym.sty) \
tex(xcolor.sty) \
tex(xmpmulti.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
