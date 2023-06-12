SUMMARY = "Describe additional object types in dtx source files"
DESCRIPTION = "The doc package includes tools for describing macros and \
environments in LaTeX source .dtx format. The dtxdescribe \
package adds additional tools for describing booleans, lengths, \
counters, keys, packages, classes, options, files, commands, \
arguments, and other objects, and also works with the standard \
document classes as well, for those who do not wish to use the \
.dtx format. Each item is given a margin tag similar to \
\\DescribeEnv, and is listed in the index by itself and also by \
category. Each item may be sorted further by an optional class. \
All index entries except code lines are hyperlinked. The \
dtxexample environment is provided for typesetting example code \
and its results. Contents are displayed verbatim along with a \
caption and cross-referencing. They are then input and \
executed, and the result is shown. Environments are also \
provided for displaying verbatim or formatted source code, \
user-interface displays, and sidebars with titles. Macros are \
provided for formatting the names of inline LaTeX objects such \
as packages and booleans, as well as program and file names, \
file types, internet objects, the names of certain programs, a \
number of logos, and inline dashes and slashes."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.07svn65445"

RPM_NAME = "texlive-dtxdescribe-2023.201.1.07svn65445-52.1.noarch.rpm"
RPM_HASH = "b00eea0db79d838c8dfe6fa5edd65d8b348a0a0b08f3f4e7d717795548ad3ddb29223ac5800bec4020a517cc12917912436423058c359e3b908b739ff1130fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dtxdescribe.sty) \
texlive-dtxdescribe"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(caption.sty) \
tex(etoolbox.sty) \
tex(fancyvrb.sty) \
tex(makeidx.sty) \
tex(newfloat.sty) \
tex(pict2e.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
