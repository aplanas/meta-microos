SUMMARY = "Embed XMP metadata in PDF with LuaTeX"
DESCRIPTION = "This package enables the inclusion of XMP (eXtensible Metadata \
Platform) data in the pdf output generated by (plain) LuaTeX. \
The use of XMP is required by PDF standards such as PDF/A."
LICENSE = "LPPL-1.0"

PV = "2023.201.2023_1.2svn66395"

RPM_NAME = "texlive-minim-xmp-2023.201.2023_1.2svn66395-54.1.noarch.rpm"
RPM_HASH = "b5bf486cba69c91568087be3a230c208179d27bff52c5a66c4faa2c4a2899aacc6016c0bedd1af8f885ecc7fca25bcb81c0c49edf5b1bb6d329df9adcd430bd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(minim-xmp.tex) texlive-minim-xmp"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
