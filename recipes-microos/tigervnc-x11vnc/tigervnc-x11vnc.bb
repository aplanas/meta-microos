SUMMARY = "Wrapper that starts x0vncserver"
DESCRIPTION = "This is a wrapper that looks like x11vnc, but starts x0vncserver instead. \
It maps common x11vnc arguments to x0vncserver arguments."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "tigervnc-x11vnc-1.13.1-3.1.noarch.rpm"
RPM_HASH = "e4c6648450d6bd41a08a3badc207de3ca611c0502107596337c3d1e473090e7fd3caa77dbcbf4831ac1e8ffda5d242a77203b4c7d7f5415a6d5535e7335e1658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tigervnc-x11vnc \
x11vnc"
RDEPENDS:${PN} += "/usr/bin/python3 \
xorg-x11-Xvnc"

inherit rpm
