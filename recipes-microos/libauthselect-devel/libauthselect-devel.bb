SUMMARY = "Development libraries and headers for authselect"
DESCRIPTION = "System header files and development libraries for authselect. Useful if \
you develop a front-end for the authselect library."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0+git.0.2c30265"

RPM_NAME = "libauthselect-devel-1.4.0+git.0.2c30265-3.2.aarch64.rpm"
RPM_HASH = "2ef909ab1746f3fcb39f1011a52b81c15320d007f54fe5a642401fbcff4ecd156215c4ad740d6735975e75d2afa28692b9cfee73dfbbad5cf8eef0f0720c1b55"

RPROVIDES:${PN} += "authselect-devel authselect-devel(aarch-64) libauthselect-devel libauthselect-devel(aarch-64) pkgconfig(authselect)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libauthselect3(aarch-64)"

inherit rpm
