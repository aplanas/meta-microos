SUMMARY = "Chinese"
DESCRIPTION = "Support for Chinese; additional packages in collection-langcjk."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63995"

RPM_NAME = "texlive-collection-langchinese-2023.201.svn63995-56.1.noarch.rpm"
RPM_HASH = "bc600edbedb49f4184d58ef605287923fb8ff0a12fb5cc56d0b0e97f7ee655abee9fe210cdd727ff35a3b32418409bffde4525e01524e386a240d9e693e79072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langchinese"
RDEPENDS:${PN} += "texlive-arphic texlive-arphic-ttf texlive-asymptote-by-example-zh-cn texlive-asymptote-faq-zh-cn texlive-asymptote-manual-zh-cn texlive-cns texlive-collection-langcjk texlive-ctex texlive-ctex-faq texlive-exam-zh texlive-fandol texlive-fduthesis texlive-hanzibox texlive-hyphen-chinese texlive-impatient-cn texlive-install-latex-guide-zh-cn texlive-latex-notes-zh-cn texlive-lshort-chinese texlive-nanicolle texlive-njurepo texlive-pgfornament-han texlive-qyxf-book texlive-texlive-zh-cn texlive-texproposal texlive-tlmgr-intro-zh-cn texlive-upzhkinsoku texlive-xpinyin texlive-xtuthesis texlive-zhlineskip texlive-zhlipsum texlive-zhmetrics texlive-zhmetrics-uptex texlive-zhnumber texlive-zhspacing"

inherit rpm
