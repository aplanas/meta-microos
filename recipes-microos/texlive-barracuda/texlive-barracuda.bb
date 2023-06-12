SUMMARY = "Draw barcodes with Lua"
DESCRIPTION = "The barracuda library is a modular Lua package for drawing \
barcode symbols. It provides modules for writing barcodes from \
a LuaTeX document. It is also possible to use Barracuda with a \
standalone Lua interpreter to draw barcodes in different \
graphic formats like SVG."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.0.12svn63708"

RPM_NAME = "texlive-barracuda-2023.201.0.0.0.12svn63708-53.1.noarch.rpm"
RPM_HASH = "349ed9e5cca1848337d808877703bfeb300b3989edec96512f62daf4eb4012b65c572d0a4fdd1c036ba08bb98a51abc858939e1000d599b0f2764bd59f21163f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(barracuda.sty) \
texlive-barracuda"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
