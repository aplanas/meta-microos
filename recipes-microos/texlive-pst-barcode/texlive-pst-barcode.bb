SUMMARY = "Print barcodes using PostScript"
DESCRIPTION = "The pst-barcode package allows printing of barcodes, in a huge \
variety of formats, including quick-response (qr) codes (see \
documentation for details). As a PSTricks package, the package \
requires pstricks. The package uses PostScript for calculating \
the bars. For PDF output use a multi-pass mechansism such as \
pst-pdf."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.19svn64182"

RPM_NAME = "texlive-pst-barcode-2023.201.0.0.19svn64182-52.1.noarch.rpm"
RPM_HASH = "5ebf73da28d0ae6afece1a2ef8548900a685bf2bb32111052d5e6bf70ae17561c8dbc1418000fe7db8f6d3936e49731138ba673692d0d21d772e3694c41bfce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-barcode.sty) \
tex(pst-barcode.tex) \
texlive-pst-barcode"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
