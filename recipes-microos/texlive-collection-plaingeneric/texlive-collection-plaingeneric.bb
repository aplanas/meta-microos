SUMMARY = "Plain (La)TeX packages"
DESCRIPTION = "Add-on packages and macros that work with plain TeX, often \
LaTeX, and occasionally other formats."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65622"

RPM_NAME = "texlive-collection-plaingeneric-2023.201.svn65622-56.1.noarch.rpm"
RPM_HASH = "1bd42b8dae02682651a1260832699eef4fe1bd8019b6d50b169a909a009f68a1ce4a240410d6a73a7bb80939f05f64d442f0191a62655c147ea63061457c3fb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-plaingeneric"
RDEPENDS:${PN} += "texlive-abbr texlive-abstyles texlive-apnum texlive-autoaligne texlive-barr texlive-bitelist texlive-borceux texlive-c-pascal texlive-catcodes texlive-chronosys texlive-collection-basic texlive-colorsep texlive-compare texlive-crossrefenum texlive-cweb-old texlive-dinat texlive-dirtree texlive-docbytex texlive-dowith texlive-eijkhout texlive-encxvlna texlive-epigram texlive-epsf texlive-epsf-dvipdfmx texlive-expex-acro texlive-expkv-bundle texlive-fenixpar texlive-figflow texlive-fixpdfmag texlive-fltpoint texlive-fntproof texlive-font-change texlive-fontch texlive-fontname texlive-gates texlive-getoptk texlive-gfnotation texlive-gobble texlive-graphics-pln texlive-gtl texlive-hlist texlive-hyplain texlive-inputnormalization texlive-insbox texlive-js-misc texlive-kastrup texlive-lambda-lists texlive-langcode texlive-lecturer texlive-letterspacing texlive-librarian texlive-listofitems texlive-localloc texlive-mathdots texlive-metatex texlive-midnight texlive-mkpattern texlive-modulus texlive-multido texlive-namedef texlive-navigator texlive-newsletr texlive-nth texlive-ofs texlive-olsak-misc texlive-outerhbox texlive-path texlive-pdf-trans texlive-pdfmsym texlive-pitex texlive-placeins-plain texlive-plainpkg texlive-plipsum texlive-plnfss texlive-plstmary texlive-poormanlog texlive-present texlive-pwebmac texlive-random texlive-randomlist texlive-resumemac texlive-ruler texlive-schemata texlive-shade texlive-simplekv texlive-soul texlive-swrule texlive-systeme texlive-tabto-generic texlive-termmenu texlive-tex-ps texlive-tex4ht texlive-texapi texlive-texdate texlive-texdimens texlive-texinfo texlive-timetable texlive-tracklang texlive-transparent-io texlive-treetex texlive-trigonometry texlive-ulem texlive-upca texlive-varisize texlive-xii texlive-xii-lat texlive-xintsession texlive-xlop texlive-yax texlive-zztex"

inherit rpm
