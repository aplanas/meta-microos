SUMMARY = "Produce 'outline' lists"
DESCRIPTION = "Defines an outline environment, which allows outline-style \
indented lists with freely mixed levels up to four levels deep. \
It replaces the nested begin/end pairs by different item tags \
\\1 to \\4 for each nesting level. This is very convenient in \
cases where nested lists are used a lot, such as for to-do \
lists or presentation slides."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn25192"

RPM_NAME = "texlive-outlines-2023.201.1.1svn25192-54.1.noarch.rpm"
RPM_HASH = "abb4424216db4ef4aaf9fea0a76b7c414b1891571befa54426deb9e46e8d10f4b4bc86ad4ab293760c79c08a4d0f456e2f26bbf70dd1aae6b70e4168d0e9a383"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(outlines.sty) texlive-outlines"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
