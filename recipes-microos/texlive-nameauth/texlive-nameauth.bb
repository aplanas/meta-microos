SUMMARY = "Name authority mechanism for consistency in body text and index"
DESCRIPTION = "Publications, that reference many names, require editors and \
proofreaders to track those names in the text and index. The \
package offers name authority macros that allow authors and \
compilers to normalize occurrences of names, variant name \
forms, and pen names in the text and index. This may help \
minimize writing and production time and cost."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.7svn65738"

RPM_NAME = "texlive-nameauth-2023.201.3.7svn65738-54.1.noarch.rpm"
RPM_HASH = "08e1eae43da8fc895bcd30945f06adf7a16e5f0c10250783b57cafa1fcf8a9f904b732a0a669449d361343d22ca5cc0d54d372f8a71f9c92a1f406dd6d39cc53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(nameauth.sty) \
texlive-nameauth"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(etoolbox.sty) \
tex(suffix.sty) \
tex(trimspaces.sty) \
tex(xargs.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
