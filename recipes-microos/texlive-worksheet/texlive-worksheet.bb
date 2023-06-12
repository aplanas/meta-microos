SUMMARY = "Easy creation of worksheets"
DESCRIPTION = "This package provides macros and an environment for easy \
worksheet creation: Use the exercise environment for formating \
exercises in a simple, efficient design; typeset customized and \
automatically numbered worksheet titles in the same way as \
standard LaTeX titles (using \\maketitle); provide course and \
author information with a scrlayer-scrpage based automated \
header; conforming to different babel languages. (Currently \
English, French, and German are supported.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48423"

RPM_NAME = "texlive-worksheet-2023.201.1.1svn48423-53.1.noarch.rpm"
RPM_HASH = "f6ddf4b9ee104494617bdbfb18aeee31e07d4983bb07f4d90eb1dfc7df2a24650eafefb303b190a57abf9b00a91d367ccd8d42a1bd99e716e06578edeb77674b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(worksheet.sty) \
texlive-worksheet"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(scrlayer-scrpage.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
