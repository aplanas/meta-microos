SUMMARY = "Cistercian numerals in LaTeX"
DESCRIPTION = "xistercian allows you to use Cistercian numerals in LaTeX. The \
glyphs are created using PGF and to a certain degree \
configurable. You can use Cistercian numerals as page numbers \
using \\pagenumbering{cistercian}. The two main macros are: \
\\cistercian{<counter>} formats the LaTeX2e counter as a \
Cistercian numeral \\cisterciannum{<integer>} formats the \
integer (given as a string) as a Cistercian numeral"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61366"

RPM_NAME = "texlive-xistercian-2023.201.1.2svn61366-52.1.noarch.rpm"
RPM_HASH = "e15ca5f6655b1bae380061beadba47e3ed0dfaa545e9d237c25b098f0c96375781eac9f9395a646271f73d3bc31e827d4059dc28da677e2a5a6d878bbac63d59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xistercian.sty) texlive-xistercian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expkv-opt.sty) tex(pgf.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
