SUMMARY = "Format mathematical intervals, ensuring proper spacing"
DESCRIPTION = "When typing an open interval as $]a,b[$, a closing bracket is \
being used in place of an opening fence and vice versa. This \
leads to the wrong spacing in, say, $]-a,b[$ or $A\\in]a,b[=B$. \
The package attempts to solve this using: \\interval{a}{b} -> \
[a,b] \\interval[open]{a}{b} -> ]a,b[ \\interval[open left]{a}{b} \
-> ]a,b] The package also supports fence scaling and ensures \
that the enclosing fences will end up having the proper closing \
and opening types. TeX maths does not do this job properly. The \
package depends on pgfkeys."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn50265"

RPM_NAME = "texlive-interval-2023.201.0.0.4svn50265-52.1.noarch.rpm"
RPM_HASH = "6f3c413e3e3056ceaaa932f2e1176f3654c2963eaa9c2246a80990689a9b7d59153fd1edfe81482d67186f99c5923af60973633a4cdd85a35211ad0d07c15a7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(interval.sty) \
texlive-interval"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pgfkeys.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
