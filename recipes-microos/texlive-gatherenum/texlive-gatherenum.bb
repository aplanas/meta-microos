SUMMARY = "A crossover of align* and enumerate"
DESCRIPTION = "This package (ab)uses the inline enumeration capabilities of \
enumitem to add a 'displayed' enumeration mode, triggered by \
adding 'gathered' to the key-value option list of the enumerate \
environment. The end result is similar to a regular enumerate \
environment wrapped in a multicols environment, with the \
following advantages: Gathered enumerate can pack items \
depending on their actual width rather than a fixed, constant \
number per line. Gathered enumeration fills items in a \
line-major order (instead of column-major order), which my \
students found less confusing. YMMV. The package depends on \
enumitem, expl3, and xparse,"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.8svn52209"

RPM_NAME = "texlive-gatherenum-2023.201.1.8svn52209-52.1.noarch.rpm"
RPM_HASH = "77c2f7cc14b0a950ad861fd70454054d321b76bb3a990f10beac6c29d3e1a0aeca763a7ce522153bcd4850e2d79743275bcc9faa2e4c3391471d98694649928d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gatherenum.sty) \
texlive-gatherenum"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(enumitem.sty) \
tex(expl3.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
