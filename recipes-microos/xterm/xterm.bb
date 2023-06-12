SUMMARY = "The basic X terminal program"
DESCRIPTION = " \
This package contains the basic X.Org terminal program desktop launcher."
LICENSE = "MIT"

PV = "380"

RPM_NAME = "xterm-380-1.1.aarch64.rpm"
RPM_HASH = "999851b66b6aa2ccd7aada8f253cc2b5a3406ccb99fe6a2289e54fb7eba2355a6c2ff72b66e2c3dd3e1a688ca9ee912943c456d8a4817a43cdaf5e032f4eb20a"

RPROVIDES:${PN} += "XFree86:/usr/X11R6/bin/xterm \
application() \
application(xterm.desktop) \
xorg-x11:/usr/X11R6/bin/xterm \
xterm \
xterm(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
luit \
perl \
xterm-bin"

inherit rpm
