SUMMARY = "Graphical frontend for xorriso"
DESCRIPTION = "xorriso is a program which maps file objects from POSIX compliant filesystems \
into Rock Ridge enhanced ISO 9660 filesystems and allows session-wise \
manipulation of such filesystems. It can load the management information of \
existing ISO images and it writes the session results to optical media or to \
filesystem objects. \
 \
This package provides a graphical frontend to xorriso."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "xorriso-tcltk-1.5.4-1.10.aarch64.rpm"
RPM_HASH = "868abde5f98b66f9e90ab5b6155f2b41c7809c2b31b2bb504f3ff43677e95ac205c770433826260592482cef0951ec472b491f46af4b474652aea2ced23812b3"

RPROVIDES:${PN} += "xorriso-tcltk \
xorriso-tcltk(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/wish \
tcl \
tk \
xorriso"

inherit rpm
