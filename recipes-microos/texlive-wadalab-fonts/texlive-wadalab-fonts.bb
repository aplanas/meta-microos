SUMMARY = "Severed fonts for texlive-wadalab"
DESCRIPTION = "The  separated fonts package for texlive-wadalab"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn42428"

RPM_NAME = "texlive-wadalab-fonts-2023.201.svn42428-53.1.noarch.rpm"
RPM_HASH = "c47ee0aef6495ef51ef6f59331afcddef2aab98c715cffaaff293065755fcbf7a2a1285f29bae0728add2fb45d67bc13ef619077cd8d12d0f3846615e73ec70f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=bg) \
font(:lang=kum) \
font(:lang=os) \
font(:lang=ru) \
font(:lang=sel) \
font(dg) \
font(dgjhw) \
font(dm) \
font(mc) \
font(mc2) \
font(mr) \
font(mr2) \
texlive-wadalab-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
