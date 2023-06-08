SUMMARY = "Change section levels easily"
DESCRIPTION = "Allows you to write '\\Level 2 {Some heading}' instead of the \
usual \\section stuff; the definitions of the levels can then \
easily be changed. There is a mechanism for shifting all \
levels. This makes it easy to bundle existing articles into a \
compilation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.94svn21095"

RPM_NAME = "texlive-outliner-2023.201.0.0.94svn21095-54.1.noarch.rpm"
RPM_HASH = "c0a844569be8345e54cc3a094c6d36eb01239b3619940f3f39c110818a71ee35941cef7652e7a04bea04f0f1d7007d66790dc5046b627918f379f27cdd1af7d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(outliner.sty) texlive-outliner"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
