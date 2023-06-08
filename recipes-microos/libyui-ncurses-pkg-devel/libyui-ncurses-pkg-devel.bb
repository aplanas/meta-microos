SUMMARY = "Libyui-ncurses-pkg header files"
DESCRIPTION = " \
This package contains the header files for the NCurses (text based) \
package selector component for libyui."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.5.2"

RPM_NAME = "libyui-ncurses-pkg-devel-4.5.2-1.1.aarch64.rpm"
RPM_HASH = "56d5deb0c5ba1ac68e2ec595b126ec087d5438eeb0511c3509d53c011f5ee037b9f36be69eb16585dd63e6beb116a87e6a24b024d0e8324547d1a3b3220690a2"

RPROVIDES:${PN} += "libyui-ncurses-pkg-devel libyui-ncurses-pkg-devel(aarch-64)"
RDEPENDS:${PN} += "boost-devel glibc-devel libstdc++-devel libyui-ncurses-devel libyui-ncurses-pkg16 libzypp-devel"

inherit rpm
