SUMMARY = "Compatibility metapackage for X.Org development libraries"
DESCRIPTION = "This package is a compatibility metapackage. It used to contain the \
X.Org development libraries."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "7.6.1"

RPM_NAME = "xorg-x11-devel-7.6.1-2.10.noarch.rpm"
RPM_HASH = "dfe5366f3feb3727a935bc7d826b8b596774d2c10a0caa530b2a76f78b6ce40e9fa4511885dc7c745ec2c97f388be990dc3ee32e773bb8454de32c90d2bd36c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "XFree86-devel xorg-x11-compat70-devel xorg-x11-devel xorg-x11-man xorg-x11-util-devel"
RDEPENDS:${PN} += "Mesa-libEGL-devel Mesa-libGL-devel fontconfig-devel freetype2-devel gccmakedep imake libFS-devel libICE-devel libSM-devel libX11-devel libXScrnSaver-devel libXau-devel libXaw-devel libXcomposite-devel libXcursor-devel libXdamage-devel libXdmcp-devel libXevie-devel libXext-devel libXfixes-devel libXfont-devel libXfontcache-devel libXft-devel libXi-devel libXi6-devel libXinerama-devel libXmu-devel libXp-devel libXpm-devel libXprintAppUtil-devel libXprintUtil-devel libXrandr-devel libXrender-devel libXres-devel libXt-devel libXtst-devel libXv-devel libXvMC-devel libXxf86dga-devel libXxf86vm-devel libdmx-devel libfontenc-devel liblbxutil-devel liboldX-devel libpciaccess-devel libpixman-1-0-devel libxcb-devel libxkbfile-devel libxkbui-devel lndir makedepend pkgconfig xbitmaps-devel xcb-util-devel xorg-cf-files xorg-sgml-doctools xorg-x11-fonts-devel xorg-x11-libxcb-devel xorg-x11-libxkbfile-devel xorg-x11-xtrans-devel"

inherit rpm
