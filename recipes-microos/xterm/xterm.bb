SUMMARY = "The basic X terminal program"
DESCRIPTION = " \
This package contains the basic X.Org terminal program desktop launcher."
LICENSE = "MIT"

PV = "379"

RPM_NAME = "xterm-379-1.3.aarch64.rpm"
RPM_HASH = "b8d7031559127657cad68783879a7bb7f02c7874f73cb255681f78f59cc7ac12982b345420a3ee38f1275cda175b0fb827b3ad8452ca10b3afe33e24efc748be"

RPROVIDES:${PN} += "XFree86:/usr/X11R6/bin/xterm application() application(xterm.desktop) xorg-x11:/usr/X11R6/bin/xterm xterm xterm(aarch-64)"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils luit perl xterm-bin"

inherit rpm
