SUMMARY = "CJK language support"
DESCRIPTION = "CJK is a macro package for LaTeX, providing simultaneous \
support for various Asian scripts in many encodings (including \
Unicode): Chinese (both traditional and simplified), Japanese, \
Korean and Thai. A special add-on feature is an interface to \
the Emacs editor (cjk-enc.el) which gives simultaneous, \
easy-to-use support to a bunch of other scripts in addition to \
the above -- Cyrillic, Greek, Latin-based scripts, Russian and \
Vietnamese are supported."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.4.8.5svn60833"

RPM_NAME = "texlive-cjkutils-2023.201.4.8.5svn60833-53.1.noarch.rpm"
RPM_HASH = "1bb088073e85f3fb0e1e578f2eae250e595e0c1fdda9e0d21deca587929013a376399ed3aa15fd9cc70ec29079a13da5b081c42f87ceac84589931c9d7604627"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(b5ka12.cfg) tex(b5kr12.cfg) tex(b5so12.cfg) tex(c1so12.cfg) tex(c2so12.cfg) tex(c3so12.cfg) tex(c4so12.cfg) tex(c5so12.cfg) tex(c6so12.cfg) tex(c7so12.cfg) tex(csso12.cfg) tex(gsfs14.cfg) tex(j2so12.cfg) tex(jsso12.cfg) tex(ksso17.cfg) texlive-cjkutils"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-cjkutils-bin texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
