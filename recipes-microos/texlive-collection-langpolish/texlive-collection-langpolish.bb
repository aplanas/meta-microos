SUMMARY = "Polish"
DESCRIPTION = "Support for Polish."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-collection-langpolish-2023.201.svn54074-56.1.noarch.rpm"
RPM_HASH = "1a41dfa7d00dadfb518d16a87840b81fc2bb23cafa64f7aab04dfd872c48e08b7749783840022371101e325985bcc2915632c5562c32245027386649caaa3828"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langpolish"
RDEPENDS:${PN} += "texlive-babel-polish texlive-bredzenie texlive-cc-pl texlive-collection-basic texlive-collection-latex texlive-gustlib texlive-gustprog texlive-hyphen-polish texlive-lshort-polish texlive-mex texlive-mwcls texlive-pl texlive-polski texlive-przechlewski-book texlive-qpxqtx texlive-tap texlive-tex-virtual-academy-pl texlive-texlive-pl texlive-utf8mex"

inherit rpm
