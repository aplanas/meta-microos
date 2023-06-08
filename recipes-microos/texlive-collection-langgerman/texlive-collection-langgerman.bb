SUMMARY = "German"
DESCRIPTION = "Support for German."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55706"

RPM_NAME = "texlive-collection-langgerman-2023.201.svn55706-56.1.noarch.rpm"
RPM_HASH = "a66340c36c4a0cbcfae20c640608d6bc1ddb78a7d407c22890f63d7b2ed1471836ca5171a5f75d3598e282e81da61ec06e002637d9465c2b5c5d0c927e85d62e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langgerman"
RDEPENDS:${PN} += "texlive-apalike-german texlive-babel-german texlive-bibleref-german texlive-booktabs-de texlive-collection-basic texlive-csquotes-de texlive-dehyph texlive-dehyph-exptl texlive-dhua texlive-dtk-bibliography texlive-etdipa texlive-etoolbox-de texlive-fifinddo-info texlive-german texlive-germbib texlive-germkorr texlive-hausarbeit-jura texlive-hyphen-german texlive-koma-script-examples texlive-l2picfaq texlive-l2tabu texlive-latexcheat-de texlive-lshort-german texlive-lualatex-doc-de texlive-microtype-de texlive-milog texlive-quran-de texlive-r_und_s texlive-schulmathematik texlive-templates-fenn texlive-templates-sommer texlive-termcal-de texlive-texlive-de texlive-tipa-de texlive-translation-arsclassica-de texlive-translation-biblatex-de texlive-translation-chemsym-de texlive-translation-ecv-de texlive-translation-enumitem-de texlive-translation-europecv-de texlive-translation-filecontents-de texlive-translation-moreverb-de texlive-udesoftec texlive-uhrzeit texlive-umlaute texlive-voss-mathcol"

inherit rpm
