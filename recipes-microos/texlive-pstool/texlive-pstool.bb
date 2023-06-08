SUMMARY = "Support for psfrag within pdfLaTeX"
DESCRIPTION = "The package works in the same sort of way as pst-pdf, but it \
also processes the PostScript graphics with psfrag to add \
labels within the graphic, before conversion. Thus the bundle \
replaces two steps of an ordinary workflow. (Naturally, the \
package requires that \\write 18 is enabled.) Pstool ensures \
that each version of each graphic is compiled once only (the \
graphic is (re-)compiled only if it has changed since the \
previous compilation of the document). This drastically speeds \
up the running of the package in the typical case (though the \
first run of any document is inevitably just as slow as with \
any similar package)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5esvn46393"

RPM_NAME = "texlive-pstool-2023.201.1.5esvn46393-53.1.noarch.rpm"
RPM_HASH = "e8bb4ce20b4c05c9cc5596b883e5a95b56098b132e6bc053444687c35a210e106d8b0d60f9bb2c5c8fbabdab78b8bec1fc7ef8850a62a44b1625814dc454a77b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pstool.sty) texlive-pstool"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(preview.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
