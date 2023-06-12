SUMMARY = "Openscap utilities"
DESCRIPTION = "The openscap-utils package contains various utilities based on openscap library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.7"

RPM_NAME = "openscap-utils-1.3.7-1.1.aarch64.rpm"
RPM_HASH = "a37b71e43e3afa9e016a0b03dc10f5c99a121d0ec429d13f854232b0128c8dfb093f2c960a184921876fec258dd7e69360eee38d4037cc5dbfee310c18309b2d"

RPROVIDES:${PN} += "openscap-utils \
openscap-utils(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/env \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libopenscap.so.25()(64bit) \
libopenscap25 \
openscap \
systemd"

inherit rpm
