SUMMARY = "Other European languages"
DESCRIPTION = "Support for a number of European languages; others (Greek, \
German, French, ...) have their own collections, depending \
simply on the size of the support."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66432"

RPM_NAME = "texlive-collection-langeuropean-2023.201.svn66432-56.1.noarch.rpm"
RPM_HASH = "98daddd03099027f8492804a06fed27a7c229b0126801531f6731a562e281e8f28b4f55fbb2b40629c0ce7758beed453ec3ebc2d3e0d8963f4566fd867943ee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langeuropean"
RDEPENDS:${PN} += "texlive-armtex texlive-babel-albanian texlive-babel-bosnian texlive-babel-breton texlive-babel-croatian texlive-babel-danish texlive-babel-dutch texlive-babel-estonian texlive-babel-finnish texlive-babel-friulan texlive-babel-hungarian texlive-babel-icelandic texlive-babel-irish texlive-babel-kurmanji texlive-babel-latin texlive-babel-latvian texlive-babel-lithuanian texlive-babel-macedonian texlive-babel-norsk texlive-babel-occitan texlive-babel-piedmontese texlive-babel-romanian texlive-babel-romansh texlive-babel-samin texlive-babel-scottish texlive-babel-slovenian texlive-babel-swedish texlive-babel-turkish texlive-babel-welsh texlive-collection-basic texlive-finbib texlive-gloss-occitan texlive-hrlatex texlive-huaz texlive-hulipsum texlive-hyphen-croatian texlive-hyphen-danish texlive-hyphen-dutch texlive-hyphen-estonian texlive-hyphen-finnish texlive-hyphen-friulan texlive-hyphen-hungarian texlive-hyphen-icelandic texlive-hyphen-irish texlive-hyphen-kurmanji texlive-hyphen-latin texlive-hyphen-latvian texlive-hyphen-lithuanian texlive-hyphen-macedonian texlive-hyphen-norwegian texlive-hyphen-occitan texlive-hyphen-piedmontese texlive-hyphen-romanian texlive-hyphen-romansh texlive-hyphen-slovenian texlive-hyphen-swedish texlive-hyphen-turkish texlive-hyphen-uppersorbian texlive-hyphen-welsh texlive-kaytannollista-latexia texlive-lithuanian texlive-lshort-dutch texlive-lshort-estonian texlive-lshort-finnish texlive-lshort-slovenian texlive-lshort-turkish texlive-nevelok texlive-rojud texlive-swebib texlive-turkmen"

inherit rpm
