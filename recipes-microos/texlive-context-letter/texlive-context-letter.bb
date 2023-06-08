SUMMARY = "ConTeXt package for writing letters"
DESCRIPTION = "A means of writing 'vanilla' letters and memos is provided, \
with support covering ConTeXt Mkii and Mkiv. The design of \
letters may be amended by a wide range of style specifications."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn60787"

RPM_NAME = "texlive-context-letter-2023.204.svn60787-54.1.noarch.rpm"
RPM_HASH = "38eeafb0be767478276848fb56cb300797147450e9a2d8de636c23294e1f630e8c2b82a695ee01169cb0a2ae682cd1541491e0b72ad7ee42b9fc69c459f7a877"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-letter"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-context texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
