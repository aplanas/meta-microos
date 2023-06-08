SUMMARY = "A versatile book class"
DESCRIPTION = "This class is intended to be an interpretation of the mwbk \
class which is a part of the mwcls package. The mwcls classes \
are simple, yet powerful and customizable classes that allow \
the end-user to customize the layout of headers, headings etc. \
They also have the benefit of being more economic in space than \
the most common LaTeX classes, while keeping a clear appearance \
and a smooth flow."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46201"

RPM_NAME = "texlive-ycbook-2023.201.svn46201-52.1.noarch.rpm"
RPM_HASH = "72a8fb80dd8421acaff168f874f034e9b2fcf48acd7a7fd5ee8b0c870f67de8adb9fef04d1fb1bb9f63e8b8ba1e4ce70168ac08ddf0e53fc625a56cbfc5e38b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ycbook.cls) texlive-ycbook"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(adjustbox.sty) tex(afterpage.sty) tex(booktabs.sty) tex(changepage.sty) tex(fontspec.sty) tex(graphicx.sty) tex(hyperref.sty) tex(ifxetex.sty) tex(inputenc.sty) tex(placeins.sty) tex(polyglossia.sty) tex(titletoc.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
