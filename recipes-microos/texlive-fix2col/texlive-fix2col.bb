SUMMARY = "Fix miscellaneous two column mode features"
DESCRIPTION = "OBSOLETE: do not use in new documents. This package will do \
nothing in LaTeX formats after 2015/01/01 as the fixes that it \
implements were incorporated into the fixltx2e package, which \
is itself obsolete as since the 2015/01/01 release these fixes \
are in the LaTeX format itself. Fix mark handling so that \
\\firstmark is taken from the first column if that column has \
any marks at all; keep two column floats like figure* in \
sequence with single column floats like figure."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.04svn38770"

RPM_NAME = "texlive-fix2col-2023.201.0.0.04svn38770-52.1.noarch.rpm"
RPM_HASH = "361180ffdbace4c20db58e04b4a8ff3d918bebba4904d219d07e1f04b1b1c8bd1f7ce0a680a35ba60176fcc66fcfe36090009dd34d36ef55806de4db2eb228f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fix2col.sty) texlive-fix2col"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
