SUMMARY = "Style for Munitions Management Project Reports"
DESCRIPTION = "Provides a class which supports typesetting Cost and \
Performance Reports and Final Reports for Munitions Management \
Reports, US Environmental Security Technology Certification \
Program. The class was commissioned and paid for by US Army \
Corps of Engineers, Engineer Research and Development Center, \
3909 Halls Ferry Road, Vicksburg, MS 39180-6199."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn17335"

RPM_NAME = "texlive-estcpmm-2023.201.0.0.4svn17335-52.1.noarch.rpm"
RPM_HASH = "b5f30c5eaa1022e4c2c629b796471567f958e0ac328442e5a19c03ed3e0b7cf995fd984d3c46a82b91b8fdf98ad6ba41ad9af54fc5dd1a1d0bd823191cc0bae6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(estcpmm.cls) texlive-estcpmm"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(book.cls) tex(caption.sty) tex(courier.sty) tex(fancyhdr.sty) tex(geometry.sty) tex(graphicx.sty) tex(helvet.sty) tex(mathptmx.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
