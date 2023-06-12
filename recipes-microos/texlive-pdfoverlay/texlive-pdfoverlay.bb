SUMMARY = "A LaTeX style for overlaying text on a PDF"
DESCRIPTION = "It is often desirable to take an exisiting PDF and easily add \
annotations or text overlaying the PDF. This might arise if you \
wish to add comments to a PDF, fill in a PDF form, or add text \
to a PDF where space has been left for notes. This package \
provides a simple interface to do this without having to resort \
to inserting one page at a time. Some or all of the pages of \
the PDF can be included and not all pages of the PDF need have \
overlayed text. It is also possible to include text between \
pages of the PDF. Another advantage of this package is that the \
overlayed text can be set as normal flowing from one page to \
another or with manual page breaks if you wish. It is also \
possible to use any standard method to position text at \
arbitrary places on a given page."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn64210"

RPM_NAME = "texlive-pdfoverlay-2023.201.1.3svn64210-51.1.noarch.rpm"
RPM_HASH = "26d2fd94ff44b43f172e163b7cb8aa56a27a9c9edb6402b74c2759c92d321dae835dd964d3c264c9d5233897a68059059e49e0eb536fac4f02d310aeb26465b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfoverlay.sty) \
texlive-pdfoverlay"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphicx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
