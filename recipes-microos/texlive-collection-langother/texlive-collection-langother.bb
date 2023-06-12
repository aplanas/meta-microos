SUMMARY = "Other languages"
DESCRIPTION = "Support for languages not otherwise listed, including Indic, \
Thai, Vietnamese, Hebrew, Indonesian, African languages, and \
plenty more. The split is made simply on the basis of the size \
of the support, to keep both collection sizes and the number of \
collections reasonable."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn59564"

RPM_NAME = "texlive-collection-langother-2023.208.svn59564-58.1.noarch.rpm"
RPM_HASH = "c419874b0aa1b8a9e4c158924fc36185fd1ae74a42df015444865c94129aea2e8dc5e6eb8d8e3cb65fcd28d60954cda9727037c5d8314c2136beea084e85141a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langother"
RDEPENDS:${PN} += "texlive-aalok \
texlive-akshar \
texlive-amsldoc-vn \
texlive-aramaic-serto \
texlive-babel-azerbaijani \
texlive-babel-esperanto \
texlive-babel-georgian \
texlive-babel-hebrew \
texlive-babel-indonesian \
texlive-babel-interlingua \
texlive-babel-malay \
texlive-babel-sorbian \
texlive-babel-thai \
texlive-babel-vietnamese \
texlive-bangla \
texlive-bangtex \
texlive-bengali \
texlive-burmese \
texlive-chhaya \
texlive-cjhebrew \
texlive-collection-basic \
texlive-ctib \
texlive-ethiop \
texlive-ethiop-t1 \
texlive-fc \
texlive-fonts-tlwg \
texlive-hindawi-latex-template \
texlive-hyphen-afrikaans \
texlive-hyphen-armenian \
texlive-hyphen-coptic \
texlive-hyphen-esperanto \
texlive-hyphen-ethiopic \
texlive-hyphen-georgian \
texlive-hyphen-indic \
texlive-hyphen-indonesian \
texlive-hyphen-interlingua \
texlive-hyphen-sanskrit \
texlive-hyphen-thai \
texlive-hyphen-turkmen \
texlive-latex-mr \
texlive-latexbangla \
texlive-latino-sine-flexione \
texlive-lshort-thai \
texlive-lshort-vietnamese \
texlive-marathi \
texlive-ntheorem-vn \
texlive-padauk \
texlive-quran-bn \
texlive-quran-ur \
texlive-sanskrit \
texlive-sanskrit-t1 \
texlive-thaienum \
texlive-thaispec \
texlive-unicode-alphabets \
texlive-velthuis \
texlive-vntex \
texlive-wnri \
texlive-wnri-latex \
texlive-xetex-devanagari"

inherit rpm
