SUMMARY = "French"
DESCRIPTION = "Support for French and Basque."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63147"

RPM_NAME = "texlive-collection-langfrench-2023.201.svn63147-56.1.noarch.rpm"
RPM_HASH = "82a156ef8387664f83970e8e24eda75eef33682c73df95275277ce1ccea53a24536a9476ec59ef1566fb3424f4b14775af1bab5d15444c91b405c910983fed70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langfrench"
RDEPENDS:${PN} += "texlive-aeguill texlive-annee-scolaire texlive-apprendre-a-programmer-en-tex texlive-apprends-latex texlive-babel-basque texlive-babel-french texlive-basque-book texlive-basque-date texlive-bib-fr texlive-bibleref-french texlive-booktabs-fr texlive-collection-basic texlive-droit-fr texlive-e-french texlive-epslatex-fr texlive-expose-expl3-dunkerque-2019 texlive-facture texlive-formation-latex-ul texlive-frenchmath texlive-frletter texlive-frpseudocode texlive-hyphen-basque texlive-hyphen-french texlive-impatient-fr texlive-impnattypo texlive-l2tabu-french texlive-latex2e-help-texinfo-fr texlive-letgut texlive-lshort-french texlive-mafr texlive-matapli texlive-profcollege texlive-proflabo texlive-proflycee texlive-tabvar texlive-tdsfrmath texlive-texlive-fr texlive-translation-array-fr texlive-translation-dcolumn-fr texlive-translation-natbib-fr texlive-translation-tabbing-fr texlive-variations texlive-visualfaq-fr texlive-visualtikz"

inherit rpm
