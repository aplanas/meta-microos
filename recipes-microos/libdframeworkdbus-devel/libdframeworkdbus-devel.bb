SUMMARY = "Development tools for libdframeworkdbus - deepin-qt-dbus-factory"
DESCRIPTION = "de-qt-dbus-factory is a repository storing auto-generated Qt5 D-Bus \
code. \
 \
The libdbusextended-devel package contains the header files and developer \
docs for libdbusextended(deepin-qt-dbus-factory)."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.22"

RPM_NAME = "libdframeworkdbus-devel-5.5.22-1.6.aarch64.rpm"
RPM_HASH = "5d40c8d87ba846a2f9177b0ffb5ac417dfb3b3f19d80f8ad0dc66d836e8a3c076bfa85527be0dd2abdac79effe5786652ab965d9486ab6e6ec27102f221eb7d8"

RPROVIDES:${PN} += "cmake(DFrameworkdbus) libdframeworkdbus-devel libdframeworkdbus-devel(aarch-64) pkgconfig(dframeworkdbus)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libdframeworkdbus2"

inherit rpm
