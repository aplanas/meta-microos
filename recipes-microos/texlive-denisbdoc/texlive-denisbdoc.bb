SUMMARY = "A personal dirty package for documenting packages"
DESCRIPTION = "A personal dirty package for documenting packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.4svn66137"

RPM_NAME = "texlive-denisbdoc-2023.201.0.0.9.4svn66137-52.1.noarch.rpm"
RPM_HASH = "fd1e7ebddcfd1ff9f2270e2fcbc0b5b7e3e9a86444c6847ee2681ddb97c6c24e15de083f1a726fcb3edb696a5fd2ef8c3d3d0c774bd0209c265d72c8e07e2f01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(denisbdoc.sty) \
texlive-denisbdoc"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(accsupp.sty) \
tex(afterpage.sty) \
tex(amssymb.sty) \
tex(attachfile2.sty) \
tex(babel.sty) \
tex(bookmark.sty) \
tex(booktabs.sty) \
tex(calc.sty) \
tex(cleveref.sty) \
tex(comment.sty) \
tex(csquotes.sty) \
tex(datetime2.sty) \
tex(enumitem.sty) \
tex(etoolbox.sty) \
tex(expl3.sty) \
tex(fixfoot.sty) \
tex(fontawesome.sty) \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(footmisc.sty) \
tex(glossaries-extra.sty) \
tex(hologo.sty) \
tex(hypcap.sty) \
tex(hyperref.sty) \
tex(iflang.sty) \
tex(ifpdf.sty) \
tex(imakeidx.sty) \
tex(l3keys2e.sty) \
tex(lscape.sty) \
tex(ltxcmds.sty) \
tex(marginnote.sty) \
tex(morewrites.sty) \
tex(mparhack.sty) \
tex(multirow.sty) \
tex(mweights.sty) \
tex(nameref.sty) \
tex(newunicodechar.sty) \
tex(parskip.sty) \
tex(path.sty) \
tex(pdflscape.sty) \
tex(pifont.sty) \
tex(refcount.sty) \
tex(rotating.sty) \
tex(siunitx.sty) \
tex(subcaption.sty) \
tex(tcolorbox.sty) \
tex(textcase.sty) \
tex(tikz.sty) \
tex(tocbibind.sty) \
tex(tocvsec2.sty) \
tex(translator.sty) \
tex(varioref.sty) \
tex(xifthen.sty) \
tex(xparse.sty) \
tex(xpatch.sty) \
tex(zref.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
