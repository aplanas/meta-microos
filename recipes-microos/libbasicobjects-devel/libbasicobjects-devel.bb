SUMMARY = "Library containing basic objects like dynamic string"
DESCRIPTION = "A small library that provides a buffer object."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.1"

RPM_NAME = "libbasicobjects-devel-0.1.1-27.18.aarch64.rpm"
RPM_HASH = "2b57a691b56f71d10b82bac41b4886e5e33b034c3b3caeb03bbed9f69e243dc242c4901ac5d7be3ae37094a06144adaec2ec58c6742b323da36b947c0bb2c2ef"

RPROVIDES:${PN} += "libbasicobjects-devel \
libbasicobjects-devel(aarch-64) \
pkgconfig(basicobjects)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbasicobjects0"

inherit rpm
