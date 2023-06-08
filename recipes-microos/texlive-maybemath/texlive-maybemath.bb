SUMMARY = "Make math bold or italic according to context"
DESCRIPTION = "The \\maybebm and \\maybeit macros can be used in maths \
expressions to make the arguments typeset as bold or italic \
respectively if the surrounding context is appropriate. They \
are useful for writing user macros for use in general contexts. \
\\maybebm is especially appropriate when section titles contain \
math expressions, since the title will appear bold but the \
header and table of contents usually replicate the title in \
normal width. It uses the bm package to make things bold \
\\maybeit performs a similar role to \\mathrm{} but the maths \
expression will be italicised if the surrounding text is. \
\\maybeitsubscript is provided to shift subscripts to the left \
if the expression is italicised."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-maybemath-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "d3d924716c1e9e16ee43d287634f89fb818c857d0dd4bfcfc2bbb1725545c132a424f49f5a0ff41d1e7f18bca64534b465d93a26c11237df2fdbc323b79a3590"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(maybemath.sty) texlive-maybemath"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(bm.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
