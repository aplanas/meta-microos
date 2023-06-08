SUMMARY = "Arbitrary size font selection in LaTeX"
DESCRIPTION = "LaTeX, by default, restricts the sizes at which you can use its \
default computer modern fonts, to a fixed set of discrete sizes \
(effectively, a set specified by Knuth). The type1cm package \
removes this restriction; this is particularly useful when \
using scalable versions of the cm fonts (Bakoma, or the \
versions from BSR/Y&Y, or True Type versions from Kinch, PCTeX, \
etc.). In fact, since modern distributions will automatically \
generate any bitmap font you might need, type1cm has wider \
application than just those using scaleable versions of the \
fonts. Note that the LaTeX distribution now contains a package \
fix-cm, which performs the task of type1cm, as well as doing \
the same job for T1- and TS1-encoded ec fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21820"

RPM_NAME = "texlive-type1cm-2023.201.svn21820-52.1.noarch.rpm"
RPM_HASH = "ec5a3cde2c92476128b341bd6cc274216e350a24b703d576d3e1ec316ed74b80cc05174e788b9b769e8eec65a42028da5d1f27b718f08c8bfb55999b2a0e7469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(type1cm.sty) texlive-type1cm"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
