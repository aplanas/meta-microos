SUMMARY = "Publisher styles, theses, etcetera"
DESCRIPTION = "The collection-publishers package"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn66330"

RPM_NAME = "texlive-collection-publishers-2023.208.svn66330-58.1.noarch.rpm"
RPM_HASH = "20408ecc02253ac347cd4d64c3d2f521eedb5b87e85427850b217dfd2590085ccc3fce2337c0114f1a5027ff79b64dc08c825f62fecff8566e1527e80cdec4f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-publishers"
RDEPENDS:${PN} += "texlive-aastex \
texlive-abnt \
texlive-abntex2 \
texlive-abntexto \
texlive-acmart \
texlive-acmconf \
texlive-active-conf \
texlive-adfathesis \
texlive-afparticle \
texlive-afthesis \
texlive-aguplus \
texlive-aiaa \
texlive-anonymous-acm \
texlive-anufinalexam \
texlive-aomart \
texlive-apa \
texlive-apa6 \
texlive-apa6e \
texlive-apa7 \
texlive-arsclassica \
texlive-articleingud \
texlive-asaetr \
texlive-ascelike \
texlive-asmeconf \
texlive-asmejour \
texlive-aucklandthesis \
texlive-bangorcsthesis \
texlive-bangorexam \
texlive-bath-bst \
texlive-beamer-fuberlin \
texlive-beamer-verona \
texlive-beilstein \
texlive-bfh-ci \
texlive-bgteubner \
texlive-bjfuthesis \
texlive-bmstu \
texlive-bmstu-iu8 \
texlive-br-lex \
texlive-brandeis-dissertation \
texlive-brandeis-problemset \
texlive-brandeis-thesis \
texlive-buctthesis \
texlive-cascadilla \
texlive-cesenaexam \
texlive-chem-journal \
texlive-chifoot \
texlive-chs-physics-report \
texlive-cje \
texlive-classicthesis \
texlive-cleanthesis \
texlive-cmpj \
texlive-collection-latex \
texlive-confproc \
texlive-cquthesis \
texlive-dccpaper \
texlive-dithesis \
texlive-ebook \
texlive-ebsthesis \
texlive-ecothesis \
texlive-ejpecp \
texlive-ekaia \
texlive-elbioimp \
texlive-els-cas-templates \
texlive-elsarticle \
texlive-elteikthesis \
texlive-emisa \
texlive-erdc \
texlive-estcpmm \
texlive-etsvthor \
texlive-facture-belge-simple-sans-tva \
texlive-fbithesis \
texlive-fcavtex \
texlive-fcltxdoc \
texlive-fei \
texlive-ftc-notebook \
texlive-gaceta \
texlive-gammas \
texlive-geradwp \
texlive-gfdl \
texlive-gradstudentresume \
texlive-grant \
texlive-gsemthesis \
texlive-gzt \
texlive-h2020proposal \
texlive-hagenberg-thesis \
texlive-har2nat \
texlive-hecthese \
texlive-hep-paper \
texlive-hfutexam \
texlive-hfutthesis \
texlive-hithesis \
texlive-hitszbeamer \
texlive-hitszthesis \
texlive-hobete \
texlive-hu-berlin-bundle \
texlive-hustthesis \
texlive-icsv \
texlive-ieeeconf \
texlive-ieeepes \
texlive-ieeetran \
texlive-ijmart \
texlive-ijsra \
texlive-imac \
texlive-imtekda \
texlive-inkpaper \
texlive-iodhbwm \
texlive-iscram \
texlive-jacow \
texlive-jmlr \
texlive-jnuexam \
texlive-jourcl \
texlive-jpsj \
texlive-jwjournal \
texlive-kdgdocs \
texlive-kdpcover \
texlive-kfupm-math-exam \
texlive-kluwer \
texlive-ksp-thesis \
texlive-ku-template \
texlive-langsci \
texlive-langsci-avm \
texlive-limecv \
texlive-lion-msc \
texlive-llncs \
texlive-llncsconf \
texlive-lni \
texlive-lps \
texlive-matc3 \
texlive-matc3mem \
texlive-mcmthesis \
texlive-mentis \
texlive-mlacls \
texlive-mluexercise \
texlive-mnras \
texlive-modeles-factures-belges-assocs \
texlive-msu-thesis \
texlive-mucproc \
texlive-mugsthesis \
texlive-muling \
texlive-musuos \
texlive-muthesis \
texlive-mynsfc \
texlive-nature \
texlive-navydocs \
texlive-nddiss \
texlive-ndsu-thesis \
texlive-ndsu-thesis-2022 \
texlive-nih \
texlive-nihbiosketch \
texlive-njustthesis \
texlive-njuthesis \
texlive-njuvisual \
texlive-nostarch \
texlive-novel \
texlive-nrc \
texlive-nwafuthesis \
texlive-nwejm \
texlive-onrannual \
texlive-opteng \
texlive-oup-authoring-template \
texlive-philosophersimprint \
texlive-pittetd \
texlive-pkuthss \
texlive-powerdot-fuberlin \
texlive-powerdot-tuliplab \
texlive-pracjourn \
texlive-prociagssymp \
texlive-proposal \
texlive-prtec \
texlive-ptptex \
texlive-qrbill \
texlive-quantumarticle \
texlive-resphilosophica \
texlive-resumecls \
texlive-revtex \
texlive-revtex4 \
texlive-revtex4-1 \
texlive-rutitlepage \
texlive-ryersonsgsthesis \
texlive-ryethesis \
texlive-sageep \
texlive-sapthesis \
texlive-schule \
texlive-scientific-thesis-cover \
texlive-scripture \
texlive-scrjrnl \
texlive-sduthesis \
texlive-se2thesis \
texlive-seu-ml-assign \
texlive-seuthesis \
texlive-seuthesix \
texlive-shortmathj \
texlive-shtthesis \
texlive-smflatex \
texlive-soton \
texlive-sphdthesis \
texlive-spie \
texlive-sr-vorl \
texlive-srdp-mathematik \
texlive-stellenbosch \
texlive-suftesi \
texlive-sugconf \
texlive-tabriz-thesis \
texlive-technion-thesis-template \
texlive-texilikechaps \
texlive-texilikecover \
texlive-thesis-ekf \
texlive-thesis-gwu \
texlive-thesis-qom \
texlive-thesis-titlepage-fhac \
texlive-thuaslogos \
texlive-thubeamer \
texlive-thucoursework \
texlive-thuthesis \
texlive-tidyres \
texlive-timbreicmc \
texlive-tlc-article \
texlive-topletter \
texlive-toptesi \
texlive-tuda-ci \
texlive-tudscr \
texlive-tugboat \
texlive-tugboat-plain \
texlive-tui \
texlive-turabian \
texlive-uaclasses \
texlive-uafthesis \
texlive-uantwerpendocs \
texlive-ucalgmthesis \
texlive-ucbthesis \
texlive-ucdavisthesis \
texlive-ucsmonograph \
texlive-ucthesis \
texlive-udes-genie-these \
texlive-uestcthesis \
texlive-ufrgscca \
texlive-uhhassignment \
texlive-uiucredborder \
texlive-uiucthesis \
texlive-ukbill \
texlive-ulthese \
texlive-umbclegislation \
texlive-umich-thesis \
texlive-umthesis \
texlive-unam-thesis \
texlive-unamth-template \
texlive-unamthesis \
texlive-unbtex \
texlive-unifith \
texlive-unigrazpub \
texlive-unitn-bimrep \
texlive-univie-ling \
texlive-unizgklasa \
texlive-unswcover \
texlive-uol-physics-report \
texlive-uothesis \
texlive-uowthesis \
texlive-uowthesistitlepage \
texlive-urcls \
texlive-uspatent \
texlive-ut-thesis \
texlive-utexasthesis \
texlive-uvaletter \
texlive-uwa-colours \
texlive-uwa-letterhead \
texlive-uwa-pcf \
texlive-uwa-pif \
texlive-uwthesis \
texlive-vancouver \
texlive-wsemclassic \
texlive-xduthesis \
texlive-xduts \
texlive-xmuthesis \
texlive-yathesis \
texlive-yazd-thesis \
texlive-yb-book \
texlive-york-thesis"

inherit rpm
