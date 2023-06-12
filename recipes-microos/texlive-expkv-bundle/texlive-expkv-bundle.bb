SUMMARY = "An expandable key=val implementation and friends"
DESCRIPTION = "This is a collection of different packages that provide \
key=value functionality in plainTeX, LaTeX, and ConTeXt. At the \
core, the expkv package implements two expandable key=value \
parsers that are somewhat fast and robust against common bugs \
in many key=value implementations (no accidental brace \
stripping, no fragility for active commas or equals signs). \
expkv-cs enables users to define expandable key=value macros in \
a comfortable and straightforward way. expkv-def provides an \
interface to define common key types for expkv similar to the \
key defining interfaces of widespread key=value \
implementations. expkv-opt allows to parse package or class \
options in LaTeX via expkv. expkv-pop is a utility package to \
define prefix oriented parsers that allow a somewhat natural \
formulation (it provides the core functionality for the \
key-defining front ends of both expkv-cs and expkv-def)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65623"

RPM_NAME = "texlive-expkv-bundle-2023.201.svn65623-52.1.noarch.rpm"
RPM_HASH = "55852b063d73833fb6c108cf6dd82741785d2422d7f32587d3dc957c27f4799c9e7018254e666fc5409240846a043bdc684734a8f1c8cb1884ce9dd37798b457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(expkv-cs.sty) \
tex(expkv-cs.tex) \
tex(expkv-def.sty) \
tex(expkv-def.tex) \
tex(expkv-opt-2020-10-10.sty) \
tex(expkv-opt.sty) \
tex(expkv-pop.sty) \
tex(expkv-pop.tex) \
tex(expkv.sty) \
tex(expkv.tex) \
tex(t-expkv-cs.tex) \
tex(t-expkv-def.tex) \
tex(t-expkv-pop.tex) \
tex(t-expkv.tex) \
texlive-expkv-bundle"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
