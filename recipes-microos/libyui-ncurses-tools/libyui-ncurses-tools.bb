SUMMARY = "Libyui - tools for the NCurses (text based) user interface"
DESCRIPTION = "This package contains tools for the NCurses (text based) \
user interface component for libyui: \
 \
libyui-terminal - useful for testing on headless machines"
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-ncurses-tools-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "51e4f2c6a8ef8bfaab9e0e606080e8b8a376e30634f3e6d1b385d3ae28aa74377ea8e07fa6e95904bd4865af7d0835ee8791d5dd8744cb358170977ae037d005"

RPROVIDES:${PN} += "libyui-ncurses-tools libyui-ncurses-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh screen"

inherit rpm
