SUMMARY = "Create PostScript and PDF graphics in TeX"
DESCRIPTION = "PGF is a macro package for creating graphics. It is platform- \
and format-independent and works together with the most \
important TeX backend drivers, including pdfTeX and dvips. It \
comes with a user-friendly syntax layer called TikZ. Its usage \
is similar to pstricks and the standard picture environment. \
PGF works with plain (pdf-)TeX, (pdf-)LaTeX, and ConTeXt. \
Unlike pstricks, it can produce either PostScript or PDF \
output."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1.10svn65553"

RPM_NAME = "texlive-pgf-2023.201.3.1.10svn65553-51.1.noarch.rpm"
RPM_HASH = "33d63aabcb17b4447d4c51400813067a3fa6d4c308901be832f86268267c3b673ade3b7806611f9172099e3ca5326d2898fdde4753f3769527cd770086cb39a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pgf.cfg) \
tex(pgf.revision.tex) \
tex(pgf.sty) \
tex(pgf.tex) \
tex(pgfarrows.sty) \
tex(pgfautomata.sty) \
tex(pgfbaseimage.sty) \
tex(pgfbaseimage.tex) \
tex(pgfbaselayers.sty) \
tex(pgfbaselayers.tex) \
tex(pgfbasematrix.sty) \
tex(pgfbasematrix.tex) \
tex(pgfbasepatterns.sty) \
tex(pgfbasepatterns.tex) \
tex(pgfbaseplot.sty) \
tex(pgfbaseplot.tex) \
tex(pgfbaseshapes.sty) \
tex(pgfbaseshapes.tex) \
tex(pgfbasesnakes.sty) \
tex(pgfbasesnakes.tex) \
tex(pgfcalendar.code.tex) \
tex(pgfcalendar.sty) \
tex(pgfcalendar.tex) \
tex(pgfcomp-version-0-65.sty) \
tex(pgfcomp-version-1-18.sty) \
tex(pgfcore.code.tex) \
tex(pgfcore.sty) \
tex(pgfcore.tex) \
tex(pgfcorearrows.code.tex) \
tex(pgfcoreexternal.code.tex) \
tex(pgfcoregraphicstate.code.tex) \
tex(pgfcoreimage.code.tex) \
tex(pgfcorelayers.code.tex) \
tex(pgfcoreobjects.code.tex) \
tex(pgfcorepathconstruct.code.tex) \
tex(pgfcorepathprocessing.code.tex) \
tex(pgfcorepathusage.code.tex) \
tex(pgfcorepatterns.code.tex) \
tex(pgfcorepoints.code.tex) \
tex(pgfcorequick.code.tex) \
tex(pgfcorerdf.code.tex) \
tex(pgfcorescopes.code.tex) \
tex(pgfcoreshade.code.tex) \
tex(pgfcoretransformations.code.tex) \
tex(pgfcoretransparency.code.tex) \
tex(pgfexternal.tex) \
tex(pgfexternalwithdepth.tex) \
tex(pgffor.code.tex) \
tex(pgffor.sty) \
tex(pgffor.tex) \
tex(pgfheaps.sty) \
tex(pgfint.code.tex) \
tex(pgfkeys.code.tex) \
tex(pgfkeys.sty) \
tex(pgfkeys.tex) \
tex(pgfkeyslibraryfiltered.code.tex) \
tex(pgflibraryarrows.code.tex) \
tex(pgflibraryarrows.meta.code.tex) \
tex(pgflibraryarrows.spaced.code.tex) \
tex(pgflibraryarrows.sty) \
tex(pgflibraryautomata.sty) \
tex(pgflibrarycurvilinear.code.tex) \
tex(pgflibrarydatavisualization.barcharts.code.tex) \
tex(pgflibrarydatavisualization.formats.functions.code.tex) \
tex(pgflibrarydatavisualization.polar.code.tex) \
tex(pgflibrarydecorations.footprints.code.tex) \
tex(pgflibrarydecorations.fractals.code.tex) \
tex(pgflibrarydecorations.markings.code.tex) \
tex(pgflibrarydecorations.pathmorphing.code.tex) \
tex(pgflibrarydecorations.pathreplacing.code.tex) \
tex(pgflibrarydecorations.shapes.code.tex) \
tex(pgflibrarydecorations.text.code.tex) \
tex(pgflibraryfadings.code.tex) \
tex(pgflibraryfixedpointarithmetic.code.tex) \
tex(pgflibraryfpu.code.tex) \
tex(pgflibrarygraphdrawing.circular.code.tex) \
tex(pgflibrarygraphdrawing.code.tex) \
tex(pgflibrarygraphdrawing.examples.code.tex) \
tex(pgflibrarygraphdrawing.force.code.tex) \
tex(pgflibrarygraphdrawing.layered.code.tex) \
tex(pgflibrarygraphdrawing.trees.code.tex) \
tex(pgflibraryintersections.code.tex) \
tex(pgflibrarylindenmayersystems.code.tex) \
tex(pgflibraryluamath.code.tex) \
tex(pgflibrarypatterns.code.tex) \
tex(pgflibrarypatterns.meta.code.tex) \
tex(pgflibraryplothandlers.code.tex) \
tex(pgflibraryplothandlers.sty) \
tex(pgflibraryplotmarks.code.tex) \
tex(pgflibraryplotmarks.sty) \
tex(pgflibraryprofiler.code.tex) \
tex(pgflibraryshadings.code.tex) \
tex(pgflibraryshapes.arrows.code.tex) \
tex(pgflibraryshapes.callouts.code.tex) \
tex(pgflibraryshapes.code.tex) \
tex(pgflibraryshapes.gates.ee.IEC.code.tex) \
tex(pgflibraryshapes.gates.ee.code.tex) \
tex(pgflibraryshapes.gates.logic.IEC.code.tex) \
tex(pgflibraryshapes.gates.logic.US.code.tex) \
tex(pgflibraryshapes.gates.logic.code.tex) \
tex(pgflibraryshapes.geometric.code.tex) \
tex(pgflibraryshapes.misc.code.tex) \
tex(pgflibraryshapes.multipart.code.tex) \
tex(pgflibraryshapes.sty) \
tex(pgflibraryshapes.symbols.code.tex) \
tex(pgflibrarysnakes.code.tex) \
tex(pgflibrarysnakes.sty) \
tex(pgflibrarysvg.path.code.tex) \
tex(pgflibrarytikzbackgrounds.sty) \
tex(pgflibrarytikztrees.sty) \
tex(pgflibrarytimelines.code.tex) \
tex(pgfmanual-en-macros.tex) \
tex(pgfmanual.code.tex) \
tex(pgfmanual.pdflinks.code.tex) \
tex(pgfmanual.prettyprinter.code.tex) \
tex(pgfmanual.sty) \
tex(pgfmath.code.tex) \
tex(pgfmath.sty) \
tex(pgfmath.tex) \
tex(pgfmathcalc.code.tex) \
tex(pgfmathfloat.code.tex) \
tex(pgfmathfunctions.base.code.tex) \
tex(pgfmathfunctions.basic.code.tex) \
tex(pgfmathfunctions.code.tex) \
tex(pgfmathfunctions.comparison.code.tex) \
tex(pgfmathfunctions.integerarithmetics.code.tex) \
tex(pgfmathfunctions.misc.code.tex) \
tex(pgfmathfunctions.random.code.tex) \
tex(pgfmathfunctions.round.code.tex) \
tex(pgfmathfunctions.trigonometric.code.tex) \
tex(pgfmathode.code.tex) \
tex(pgfmathparser.code.tex) \
tex(pgfmathutil.code.tex) \
tex(pgfmoduleanimations.code.tex) \
tex(pgfmodulebending.code.tex) \
tex(pgfmoduledatavisualization.code.tex) \
tex(pgfmoduledecorations.code.tex) \
tex(pgfmodulematrix.code.tex) \
tex(pgfmodulenonlineartransformations.code.tex) \
tex(pgfmoduleoo.code.tex) \
tex(pgfmoduleparser.code.tex) \
tex(pgfmoduleplot.code.tex) \
tex(pgfmoduleshapes.code.tex) \
tex(pgfmodulesnakes.code.tex) \
tex(pgfmodulesorting.code.tex) \
tex(pgfnodes.sty) \
tex(pgfpages.sty) \
tex(pgfparser.sty) \
tex(pgfpict2e.sty) \
tex(pgfrcs.code.tex) \
tex(pgfrcs.sty) \
tex(pgfrcs.tex) \
tex(pgfshade.sty) \
tex(pgfsys-common-pdf-via-dvi.def) \
tex(pgfsys-common-pdf.def) \
tex(pgfsys-common-postscript.def) \
tex(pgfsys-common-svg.def) \
tex(pgfsys-dvi.def) \
tex(pgfsys-dvipdfm.def) \
tex(pgfsys-dvipdfmx.def) \
tex(pgfsys-dvips.def) \
tex(pgfsys-dvisvgm.def) \
tex(pgfsys-dvisvgm4ht.def) \
tex(pgfsys-luatex.def) \
tex(pgfsys-pdftex.def) \
tex(pgfsys-tex4ht.def) \
tex(pgfsys-textures.def) \
tex(pgfsys-vtex.def) \
tex(pgfsys-xetex.def) \
tex(pgfsys.code.tex) \
tex(pgfsys.sty) \
tex(pgfsys.tex) \
tex(pgfsysanimations.code.tex) \
tex(pgfsysprotocol.code.tex) \
tex(pgfsyssoftpath.code.tex) \
tex(pgfutil-common-lists.tex) \
tex(pgfutil-common.tex) \
tex(pgfutil-context.def) \
tex(pgfutil-latex.def) \
tex(pgfutil-plain.def) \
tex(t-pgf.tex) \
tex(t-pgfbim.tex) \
tex(t-pgfbla.tex) \
tex(t-pgfbma.tex) \
tex(t-pgfbpl.tex) \
tex(t-pgfbpt.tex) \
tex(t-pgfbsh.tex) \
tex(t-pgfbsn.tex) \
tex(t-pgfcal.tex) \
tex(t-pgfcor.tex) \
tex(t-pgffor.tex) \
tex(t-pgfkey.tex) \
tex(t-pgfmat.tex) \
tex(t-pgfmod.tex) \
tex(t-pgfrcs.tex) \
tex(t-pgfsys.tex) \
tex(t-tikz.tex) \
tex(tikz.code.tex) \
tex(tikz.sty) \
tex(tikz.tex) \
tex(tikzexternal.sty) \
tex(tikzexternalshared.code.tex) \
tex(tikzlibrary3d.code.tex) \
tex(tikzlibraryangles.code.tex) \
tex(tikzlibraryanimations.code.tex) \
tex(tikzlibraryarrows.code.tex) \
tex(tikzlibraryautomata.code.tex) \
tex(tikzlibrarybabel.code.tex) \
tex(tikzlibrarybackgrounds.code.tex) \
tex(tikzlibrarybending.code.tex) \
tex(tikzlibrarycalc.code.tex) \
tex(tikzlibrarycalendar.code.tex) \
tex(tikzlibrarychains.code.tex) \
tex(tikzlibrarycircuits.code.tex) \
tex(tikzlibrarycircuits.ee.IEC.code.tex) \
tex(tikzlibrarycircuits.ee.code.tex) \
tex(tikzlibrarycircuits.logic.CDH.code.tex) \
tex(tikzlibrarycircuits.logic.IEC.code.tex) \
tex(tikzlibrarycircuits.logic.US.code.tex) \
tex(tikzlibrarycircuits.logic.code.tex) \
tex(tikzlibrarydatavisualization.3d.code.tex) \
tex(tikzlibrarydatavisualization.barcharts.code.tex) \
tex(tikzlibrarydatavisualization.code.tex) \
tex(tikzlibrarydatavisualization.formats.functions.code.tex) \
tex(tikzlibrarydatavisualization.polar.code.tex) \
tex(tikzlibrarydatavisualization.sparklines.code.tex) \
tex(tikzlibrarydecorations.code.tex) \
tex(tikzlibrarydecorations.footprints.code.tex) \
tex(tikzlibrarydecorations.fractals.code.tex) \
tex(tikzlibrarydecorations.markings.code.tex) \
tex(tikzlibrarydecorations.pathmorphing.code.tex) \
tex(tikzlibrarydecorations.pathreplacing.code.tex) \
tex(tikzlibrarydecorations.shapes.code.tex) \
tex(tikzlibrarydecorations.text.code.tex) \
tex(tikzlibraryer.code.tex) \
tex(tikzlibraryexternal.code.tex) \
tex(tikzlibraryfadings.code.tex) \
tex(tikzlibraryfit.code.tex) \
tex(tikzlibraryfixedpointarithmetic.code.tex) \
tex(tikzlibraryfolding.code.tex) \
tex(tikzlibraryfpu.code.tex) \
tex(tikzlibrarygraphdrawing.code.tex) \
tex(tikzlibrarygraphdrawing.evolving.code.tex) \
tex(tikzlibrarygraphs.code.tex) \
tex(tikzlibrarygraphs.standard.code.tex) \
tex(tikzlibraryintersections.code.tex) \
tex(tikzlibrarylindenmayersystems.code.tex) \
tex(tikzlibrarymath.code.tex) \
tex(tikzlibrarymatrix.code.tex) \
tex(tikzlibrarymindmap.code.tex) \
tex(tikzlibrarypatterns.code.tex) \
tex(tikzlibrarypatterns.meta.code.tex) \
tex(tikzlibraryperspective.code.tex) \
tex(tikzlibrarypetri.code.tex) \
tex(tikzlibraryplothandlers.code.tex) \
tex(tikzlibraryplotmarks.code.tex) \
tex(tikzlibrarypositioning.code.tex) \
tex(tikzlibraryquotes.code.tex) \
tex(tikzlibraryrdf.code.tex) \
tex(tikzlibraryscopes.code.tex) \
tex(tikzlibraryshadings.code.tex) \
tex(tikzlibraryshadows.code.tex) \
tex(tikzlibraryshapes.arrows.code.tex) \
tex(tikzlibraryshapes.callouts.code.tex) \
tex(tikzlibraryshapes.code.tex) \
tex(tikzlibraryshapes.gates.logic.IEC.code.tex) \
tex(tikzlibraryshapes.gates.logic.US.code.tex) \
tex(tikzlibraryshapes.geometric.code.tex) \
tex(tikzlibraryshapes.misc.code.tex) \
tex(tikzlibraryshapes.multipart.code.tex) \
tex(tikzlibraryshapes.symbols.code.tex) \
tex(tikzlibrarysnakes.code.tex) \
tex(tikzlibraryspy.code.tex) \
tex(tikzlibrarysvg.path.code.tex) \
tex(tikzlibrarythrough.code.tex) \
tex(tikzlibrarytopaths.code.tex) \
tex(tikzlibrarytrees.code.tex) \
tex(tikzlibraryturtle.code.tex) \
tex(tikzlibraryviews.code.tex) \
tex(xxcolor.sty) \
texlive-pgf"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(atbegshi.sty) \
tex(calc.sty) \
tex(everyshi.sty) \
tex(graphicx.sty) \
tex(keyval.sty) \
tex(xcolor.sty) \
texlive \
texlive-atveryend \
texlive-filesystem \
texlive-fp \
texlive-graphics \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-ms \
texlive-pdftexcmds \
texlive-scripts \
texlive-scripts-bin \
texlive-xcolor"

inherit rpm
