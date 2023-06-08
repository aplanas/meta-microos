SUMMARY = "LaTeX Class for the Israel Journal of Mathematics"
DESCRIPTION = "The Israel Journal of Mathematics is published by The Hebrew \
University Magnes Press. This class provides LaTeX support for \
its authors and editors. It strives to achieve the distinct \
'look and feel' of the journal, while having the interface \
similar to that of the amsart document class. This will help \
authors already familiar with amsart to easily submit \
manuscripts for The Israel Journal of Mathematics or to put the \
preprints in arXiv with minimal changes in the LaTeX source."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn30958"

RPM_NAME = "texlive-ijmart-2023.201.1.7svn30958-52.1.noarch.rpm"
RPM_HASH = "e8bfa80885cfbe3dc8a7739b193494df4b1bca4f06efda81074e293103ae5aabbab50107d1f14b5e77787b98e8f9bccac7e878a35b0cafdcd1d671c3ba292e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ijmart.cls) texlive-ijmart"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsart.cls) tex(fancyhdr.sty) tex(ifpdf.sty) tex(lastpage.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
