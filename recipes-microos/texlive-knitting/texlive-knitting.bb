SUMMARY = "Produce knitting charts, in Plain TeX or LaTeX"
DESCRIPTION = "The package provides symbol fonts and commands to write charted \
instructions for cable and lace knitting patterns, using either \
plain TeX or LaTeX. The fonts are available both as Metafont \
source and in Adobe Type 1 format."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn50782"

RPM_NAME = "texlive-knitting-2023.201.3.0svn50782-55.1.noarch.rpm"
RPM_HASH = "a03b7624589d9f0766c5cfeb30fc3f80ef7d075fa90c80a7493b9e30797149b753b185205109f576b4890bc74d448ea83752b3de6375f46b602e7143c4a92ae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(knitfont.map) \
tex(knitg_sc_in.tfm) \
tex(knitg_sc_out.tfm) \
tex(knitgg.tfm) \
tex(knitgn.tfm) \
tex(knitgp.tfm) \
tex(knitmg.tfm) \
tex(knitml.tfm) \
tex(knitmn.tfm) \
tex(knitmp.tfm) \
tex(knitmr.tfm) \
tex(knitn_sc_in.tfm) \
tex(knitn_sc_out.tfm) \
tex(knitnl.tfm) \
tex(knitnn.tfm) \
tex(knitnp.tfm) \
tex(knitnr.tfm) \
tex(knitting.sty) \
tex(knitting.tex) \
tex(knitwg.tfm) \
tex(knitwn.tfm) \
tex(knitwp.tfm) \
tex(uknit.fd) \
texlive-knitting"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-knitting-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
