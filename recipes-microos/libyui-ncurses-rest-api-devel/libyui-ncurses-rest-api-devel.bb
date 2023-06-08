SUMMARY = "Libyui - Header files for the NCurses REST API plugin"
DESCRIPTION = " \
This provides a libyui REST API plugin for the Ncurses frontend. \
This package contains the header files for the plugin. \
 \
This is not needed for using the REST API, only for developing \
extensions for it."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-ncurses-rest-api-devel-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "8f167082d0623b102c5f44da37ca46a7a32b3527fe617166a734f3617b793b44154cc2a07de771a9bcd80d11546bf344e28146fac10f41b3ea29d93b5125e762"

RPROVIDES:${PN} += "libyui-ncurses-rest-api-devel libyui-ncurses-rest-api-devel(aarch-64)"
RDEPENDS:${PN} += "glibc-devel libstdc++-devel libyui-ncurses-devel libyui-ncurses-rest-api16 libyui-rest-api-devel"

inherit rpm
