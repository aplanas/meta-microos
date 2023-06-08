SUMMARY = "Romande ADF fonts and LaTeX support"
DESCRIPTION = "Romande ADF is a serif font family with oldstyle figures, \
designed as a substitute for Times, Tiffany or Caslon. The \
family currently includes upright, italic and small-caps shapes \
in each of regular and demi-bold weights and an italic script \
in regular. The support package renames the fonts according to \
the Karl Berry fontname scheme and defines four families. Two \
of these primarily provide access to the 'standard' or default \
characters while the 'alternate' families support alternate \
characters, additional ligatures and the long s. The included \
package files provide access to these features in LaTeX as \
explained in the documentation. The LaTeX support requires the \
nfssext-cfr and the xkeyval packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.008_v7_scsvn19537"

RPM_NAME = "texlive-romande-2023.201.1.008_v7_scsvn19537-53.1.noarch.rpm"
RPM_HASH = "ebdc653d110ab7ab8ef592a60357272d77123f456c12fcc70f519166cf56682659fab4051dd42b893a1ad9c6e273bddd2a9b97bc8e8176ddf94ff0c445c550dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(romande-supp.enc) tex(romande.sty) tex(s-yrdd.tfm) tex(s-yrddi.tfm) tex(s-yrdr.tfm) tex(s-yrdri.tfm) tex(s-yrdriw.tfm) tex(t1-romandeadf-alt-yrdd.tfm) tex(t1-romandeadf-alt-yrddi.tfm) tex(t1-romandeadf-alt-yrdr.tfm) tex(t1-romandeadf-alt-yrdri.tfm) tex(t1-romandeadf-alt-yrdriw.tfm) tex(t1-romandeadf-alt.enc) tex(t1-romandeadf-yrdd.tfm) tex(t1-romandeadf-yrddc.tfm) tex(t1-romandeadf-yrddi.tfm) tex(t1-romandeadf-yrdr.tfm) tex(t1-romandeadf-yrdrc.tfm) tex(t1-romandeadf-yrdri.tfm) tex(t1-romandeadf-yrdriw.tfm) tex(t1-romandeadf.enc) tex(t1yrd.fd) tex(t1yrda.fd) tex(t1yrdaw.fd) tex(t1yrdw.fd) tex(ts1-euro-yrd.enc) tex(ts1-yrdd.tfm) tex(ts1-yrddi.tfm) tex(ts1-yrdr.tfm) tex(ts1-yrdri.tfm) tex(ts1-yrdriw.tfm) tex(ts1yrd.fd) tex(ts1yrda.fd) tex(ts1yrdaw.fd) tex(ts1yrdw.fd) tex(yrd.map) tex(yrdd8c.tfm) tex(yrdd8c.vf) tex(yrdd8t.tfm) tex(yrdd8t.vf) tex(yrdda8t.tfm) tex(yrdda8t.vf) tex(yrddai8t.tfm) tex(yrddai8t.vf) tex(yrddc8t.tfm) tex(yrddc8t.vf) tex(yrddi8c.tfm) tex(yrddi8c.vf) tex(yrddi8t.tfm) tex(yrddi8t.vf) tex(yrdr8c.tfm) tex(yrdr8c.vf) tex(yrdr8t.tfm) tex(yrdr8t.vf) tex(yrdra8t.tfm) tex(yrdra8t.vf) tex(yrdrai8t.tfm) tex(yrdrai8t.vf) tex(yrdraiw8t.tfm) tex(yrdraiw8t.vf) tex(yrdrc8t.tfm) tex(yrdrc8t.vf) tex(yrdri8c.tfm) tex(yrdri8c.vf) tex(yrdri8t.tfm) tex(yrdri8t.vf) tex(yrdriw8c.tfm) tex(yrdriw8c.vf) tex(yrdriw8t.tfm) tex(yrdriw8t.vf) texlive-romande"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(fontenc.sty) tex(nfssext-cfr.sty) tex(textcomp.sty) tex(updmap.cfg) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-romande-fonts texlive-scripts texlive-scripts-bin"

inherit rpm
