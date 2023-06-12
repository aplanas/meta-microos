SUMMARY = "Chinese"
DESCRIPTION = "Support for Chinese; additional packages in collection-langcjk."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn63995"

RPM_NAME = "texlive-collection-langchinese-2023.208.svn63995-58.1.noarch.rpm"
RPM_HASH = "c6932d9af5cf4928bbba4cd37215e191347f3ad327fda513cba18f39cb96e0ec8303ec64e8c49a4341f6c6555d710b1f6fbc8c8315bea1dca66ad2221d6ca216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langchinese"
RDEPENDS:${PN} += "texlive-arphic \
texlive-arphic-ttf \
texlive-asymptote-by-example-zh-cn \
texlive-asymptote-faq-zh-cn \
texlive-asymptote-manual-zh-cn \
texlive-cns \
texlive-collection-langcjk \
texlive-ctex \
texlive-ctex-faq \
texlive-exam-zh \
texlive-fandol \
texlive-fduthesis \
texlive-hanzibox \
texlive-hyphen-chinese \
texlive-impatient-cn \
texlive-install-latex-guide-zh-cn \
texlive-latex-notes-zh-cn \
texlive-lshort-chinese \
texlive-nanicolle \
texlive-njurepo \
texlive-pgfornament-han \
texlive-qyxf-book \
texlive-texlive-zh-cn \
texlive-texproposal \
texlive-tlmgr-intro-zh-cn \
texlive-upzhkinsoku \
texlive-xpinyin \
texlive-xtuthesis \
texlive-zhlineskip \
texlive-zhlipsum \
texlive-zhmetrics \
texlive-zhmetrics-uptex \
texlive-zhnumber \
texlive-zhspacing"

inherit rpm
