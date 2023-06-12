SUMMARY = "LaTeX templates of Technische Universitat Darmstadt"
DESCRIPTION = "The TUDa-CI-Bundle provides a possibility to use the Corporate \
Design of TU Darmstadt in LaTeX. It contains documentclasses as \
well as some helper packages and config files together with \
some templates for user documentation, which currently are only \
available in German."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.29svn65254"

RPM_NAME = "texlive-tuda-ci-2023.201.3.29svn65254-52.1.noarch.rpm"
RPM_HASH = "9664d6b4465dfb7905abe155656d4404faab2da88d91288230c186d7163ea889a92ca238a0e04da6efec9d7c1039de64c0508f8f483b76f7b29e6b8797f8c91c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemeTUDa.sty) \
tex(beamerfontthemeTUDa.sty) \
tex(beamerinnerthemeTUDa.sty) \
tex(beamerouterthemeTUDa.sty) \
tex(beamerthemeTUDa-mecheng.sty) \
tex(beamerthemeTUDa.sty) \
tex(tuda-a0paper.clo) \
tex(tuda-a1paper.clo) \
tex(tuda-a2paper.clo) \
tex(tuda-a3paper.clo) \
tex(tuda-a4paper.clo) \
tex(tuda-a5paper.clo) \
tex(tuda-pgfplots.sty) \
tex(tudabeamer.cls) \
tex(tudacolors.def) \
tex(tudacolors.sty) \
tex(tudaexercise.cls) \
tex(tudafonts.sty) \
tex(tudaleaflet.cls) \
tex(tudaletter.cls) \
tex(tudalettersize10pt.clo) \
tex(tudamecheng.cfg) \
tex(tudaposter.cls) \
tex(tudapub.cls) \
tex(tudarules.sty) \
tex(tudasciposter.cls) \
tex(tudasize9pt.clo) \
tex(tudathesis.cfg) \
texlive-tuda-ci"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(URspecialopts.sty) \
tex(XCharter.sty) \
tex(afterpage.sty) \
tex(anyfontsize.sty) \
tex(beamer.cls) \
tex(environ.sty) \
tex(expl3.sty) \
tex(fontspec.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(iftex.sty) \
tex(inputenc.sty) \
tex(l3keys2e.sty) \
tex(leaflet.cls) \
tex(luainputenc.sty) \
tex(microtype.sty) \
tex(pdfx.sty) \
tex(pgf.sty) \
tex(pgfplots.sty) \
tex(qrcode.sty) \
tex(ragged2e.sty) \
tex(roboto-mono.sty) \
tex(roboto.sty) \
tex(scrartcl.cls) \
tex(scrextend.sty) \
tex(scrlayer-notecolumn.sty) \
tex(scrlayer-scrpage.sty) \
tex(scrlayer.sty) \
tex(scrletter.cls) \
tex(scrlfile.sty) \
tex(tcolorbox.sty) \
tex(textcomp.sty) \
tex(tikz.sty) \
tex(trimclip.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
