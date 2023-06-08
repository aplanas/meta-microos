SUMMARY = "Humanities packages"
DESCRIPTION = "Packages for law, linguistics, social sciences, humanities, \
etc."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65216"

RPM_NAME = "texlive-collection-humanities-2023.201.svn65216-56.1.noarch.rpm"
RPM_HASH = "3fe89550f371c2cc110639060e80049f48674e23d25189aab5e12a468f906347891d644de88795c762abdc2717300bf458b88172a1c83272f7d71c2005901613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-humanities"
RDEPENDS:${PN} += "texlive-adtrees texlive-bibleref texlive-bibleref-lds texlive-bibleref-mouth texlive-bibleref-parse texlive-collection-latex texlive-covington texlive-diadia texlive-dramatist texlive-dvgloss texlive-ecltree texlive-edfnotes texlive-eledform texlive-eledmac texlive-expex texlive-gb4e texlive-gmverse texlive-jura texlive-juraabbrev texlive-juramisc texlive-jurarsp texlive-langnames texlive-ledmac texlive-lexikon texlive-lexref texlive-ling-macros texlive-linguex texlive-liturg texlive-metrix texlive-nnext texlive-parallel texlive-parrun texlive-phonrule texlive-plari texlive-play texlive-poemscol texlive-poetry texlive-poetrytex texlive-qobitree texlive-qtree texlive-reledmac texlive-rrgtrees texlive-rtklage texlive-screenplay texlive-screenplay-pkg texlive-sides texlive-stage texlive-textglos texlive-thalie texlive-theatre texlive-tree-dvips texlive-verse texlive-xyling"

inherit rpm
