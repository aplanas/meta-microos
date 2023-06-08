SUMMARY = "LaTeX fundamental packages"
DESCRIPTION = "These packages are either mandated by the core LaTeX team, or \
very widely used and strongly recommended in practice."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63515"

RPM_NAME = "texlive-collection-latex-2023.201.svn63515-56.1.noarch.rpm"
RPM_HASH = "10f65c3f431ad54390d9558f8ff5bbd232341ab439fe8bbeb502466f9a3e5f68db17d2f6288db11fe343a085fa6d3087a9f28f347c6c4eae1bbcae6185dd1b31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(latex) texlive-collection-latex"
RDEPENDS:${PN} += "texlive-ae texlive-amscls texlive-amsmath texlive-atbegshi texlive-atveryend texlive-auxhook texlive-babel texlive-babel-english texlive-babelbib texlive-bigintcalc texlive-bitset texlive-bookmark texlive-carlisle texlive-collection-basic texlive-colortbl texlive-epstopdf-pkg texlive-etexcmds texlive-fancyhdr texlive-firstaid texlive-fix2col texlive-geometry texlive-gettitlestring texlive-graphics texlive-graphics-cfg texlive-grfext texlive-hopatch texlive-hycolor texlive-hyperref texlive-intcalc texlive-kvdefinekeys texlive-kvoptions texlive-kvsetkeys texlive-l3backend texlive-l3kernel texlive-l3packages texlive-latex texlive-latex-bin texlive-latex-fonts texlive-latex-lab texlive-latexconfig texlive-letltxmacro texlive-ltxcmds texlive-ltxmisc texlive-mfnfss texlive-mptopdf texlive-natbib texlive-oberdiek texlive-pagesel texlive-pdfescape texlive-pslatex texlive-psnfss texlive-pspicture texlive-refcount texlive-rerunfilecheck texlive-stringenc texlive-tools texlive-uniquecounter texlive-url"

inherit rpm
