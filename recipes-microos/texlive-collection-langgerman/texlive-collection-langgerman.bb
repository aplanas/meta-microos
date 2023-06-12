SUMMARY = "German"
DESCRIPTION = "Support for German."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn55706"

RPM_NAME = "texlive-collection-langgerman-2023.208.svn55706-58.1.noarch.rpm"
RPM_HASH = "537e6f7196b0542755a0109b05c4ecc217515760c46b66a518aba04cf74eb87c1a56a0153ade702e9a2165cb9b9845517a02f084ebcbbfcb24d30aa13a665989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langgerman"
RDEPENDS:${PN} += "texlive-apalike-german texlive-babel-german texlive-bibleref-german texlive-booktabs-de texlive-collection-basic texlive-csquotes-de texlive-dehyph texlive-dehyph-exptl texlive-dhua texlive-dtk-bibliography texlive-etdipa texlive-etoolbox-de texlive-fifinddo-info texlive-german texlive-germbib texlive-germkorr texlive-hausarbeit-jura texlive-hyphen-german texlive-koma-script-examples texlive-l2picfaq texlive-l2tabu texlive-latexcheat-de texlive-lshort-german texlive-lualatex-doc-de texlive-microtype-de texlive-milog texlive-quran-de texlive-r_und_s texlive-schulmathematik texlive-templates-fenn texlive-templates-sommer texlive-termcal-de texlive-texlive-de texlive-tipa-de texlive-translation-arsclassica-de texlive-translation-biblatex-de texlive-translation-chemsym-de texlive-translation-ecv-de texlive-translation-enumitem-de texlive-translation-europecv-de texlive-translation-filecontents-de texlive-translation-moreverb-de texlive-udesoftec texlive-uhrzeit texlive-umlaute texlive-voss-mathcol"

inherit rpm
