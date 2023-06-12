SUMMARY = "X"
DESCRIPTION = "This package contains the X.Org Server SDK."
LICENSE = "MIT"

PV = "21.1.8"

RPM_NAME = "xorg-x11-server-sdk-21.1.8-1.1.aarch64.rpm"
RPM_HASH = "3eb44822396d59afdc46284f27f04fd4a7c5ed87dba06553afb80fa4d5299ebd6d7812a90148682fdb13f71ffe9ea3124b570452b8d688fe8dda1b072960d3ba"

RPROVIDES:${PN} += "glamor-devel \
pkgconfig(xorg-server) \
rpm_macro(x11_abi_ansic_req) \
rpm_macro(x11_abi_extension_req) \
rpm_macro(x11_abi_has_dpms_get_capabilities) \
rpm_macro(x11_abi_videodrv_req) \
rpm_macro(x11_abi_xinput_req) \
xorg-x11-sdk \
xorg-x11-server-sdk \
xorg-x11-server-sdk(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
autoconf \
automake \
c_compiler \
libtool \
pkgconfig(dri) \
pkgconfig(dri2proto) \
pkgconfig(dri3proto) \
pkgconfig(fontconfig) \
pkgconfig(fontenc) \
pkgconfig(fontsproto) \
pkgconfig(freetype2) \
pkgconfig(glproto) \
pkgconfig(ice) \
pkgconfig(inputproto) \
pkgconfig(kbproto) \
pkgconfig(libdrm) \
pkgconfig(libevdev) \
pkgconfig(libudev) \
pkgconfig(libxcvt) \
pkgconfig(mtdev) \
pkgconfig(pciaccess) \
pkgconfig(pixman-1) \
pkgconfig(presentproto) \
pkgconfig(randrproto) \
pkgconfig(renderproto) \
pkgconfig(resourceproto) \
pkgconfig(scrnsaverproto) \
pkgconfig(sm) \
pkgconfig(videoproto) \
pkgconfig(x11) \
pkgconfig(xau) \
pkgconfig(xdmcp) \
pkgconfig(xext) \
pkgconfig(xextproto) \
pkgconfig(xf86driproto) \
pkgconfig(xfixes) \
pkgconfig(xineramaproto) \
pkgconfig(xkbfile) \
pkgconfig(xmu) \
pkgconfig(xorg-macros) \
pkgconfig(xp) \
pkgconfig(xpm) \
pkgconfig(xprintutil) \
pkgconfig(xproto) \
pkgconfig(xrender) \
pkgconfig(xt) \
pkgconfig(xtrans) \
pkgconfig(xv) \
xorg-x11-server"

inherit rpm
