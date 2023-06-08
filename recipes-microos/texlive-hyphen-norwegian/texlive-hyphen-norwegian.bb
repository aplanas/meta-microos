SUMMARY = "Norwegian Bokmal and Nynorsk hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Norwegian Bokmal and Nynorsk in T1/EC \
and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58609"

RPM_NAME = "texlive-hyphen-norwegian-2023.201.svn58609-52.1.noarch.rpm"
RPM_HASH = "f1483df54a2b4cdd73b2781d404dc6d1b00ca28ac972983aa8c5179c58c50138c2e6c358f22c96270772fe56dfef45c2c726c43d08cbf1ebf270cf6cbd094676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-nb.ec.tex) tex(hyph-nb.tex) tex(hyph-nn.ec.tex) tex(hyph-nn.tex) tex(hyph-no.tex) tex(loadhyph-nb.tex) tex(loadhyph-nn.tex) texlive-hyphen-norwegian"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(language.dat) tex(language.dat.lua) tex(language.def) texlive texlive-filesystem texlive-hyph-utf8 texlive-hyphen-base texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
