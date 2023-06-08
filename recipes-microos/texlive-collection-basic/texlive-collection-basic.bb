SUMMARY = "Essential programs and files"
DESCRIPTION = "These files are regarded as basic for any TeX system, covering \
plain TeX macros, Computer Modern fonts, and configuration for \
common drivers; no LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59159"

RPM_NAME = "texlive-collection-basic-2023.201.svn59159-56.1.noarch.rpm"
RPM_HASH = "5bb229283107bd2a0a3b283267a57d8f1796dead0990121e7a248c13c2245634311fbd87e05c797d35ab37c83c83361c4ad13aa17eb186cd89797ec91eec0063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(basic) tex(tex) texlive-collection-basic"
RDEPENDS:${PN} += "texlive-amsfonts texlive-bibtex texlive-cm texlive-colorprofiles texlive-dvipdfmx texlive-dvips texlive-ec texlive-enctex texlive-etex texlive-etex-pkg texlive-glyphlist texlive-graphics-def texlive-hyph-utf8 texlive-hyphen-base texlive-hyphenex texlive-ifplatform texlive-iftex texlive-knuth-lib texlive-knuth-local texlive-kpathsea texlive-lua-alt-getopt texlive-luahbtex texlive-luatex texlive-makeindex texlive-metafont texlive-mflogo texlive-mfware texlive-modes texlive-pdftex texlive-plain texlive-scripts texlive-tex texlive-tex-ini-files texlive-texlive-common texlive-texlive-en texlive-texlive.infra texlive-unicode-data texlive-xdvi"

inherit rpm
