SUMMARY = "LaTeX class and template for EU H2020 RIA proposal"
DESCRIPTION = "This package consists of a class file as well as FET and ICT \
proposal templates for writing EU H2020 RIA proposals and \
generating automatically the many cross-referenced tables that \
are required."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn38428"

RPM_NAME = "texlive-h2020proposal-2023.201.1.0svn38428-53.1.noarch.rpm"
RPM_HASH = "4340cb5404913494aeba4681a05efe0fc5fb873ed31867e057d3b7d6e9a3e02b690d807820a5d1bcf0c0c0e0e3f2d4eb5ca4a46647c1ebcc7bb69726a1061f98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(h2020proposal.cls) \
texlive-h2020proposal"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(colortbl.sty) \
tex(coolstr.sty) \
tex(longtable.sty) \
tex(memoir.cls) \
tex(morewrites.sty) \
tex(rotating.sty) \
tex(showkeys.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
