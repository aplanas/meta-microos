SUMMARY = "Development files for the OpenVAS wmiclient library"
DESCRIPTION = "The support libraries for the Greenbone Vulnerability Management framework. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libopenvas_wmiclient."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.5"

RPM_NAME = "libopenvas_wmiclient-devel-1.0.5-2.1.aarch64.rpm"
RPM_HASH = "c326ed3918f6ec7ea3719f264dfc29390824a2c11eee2e8ae19ba8391e8e5fabeaa3458ee437ed1277b7445c4146ad8f129da3aa17cb359e6906d7a9a7627798"

RPROVIDES:${PN} += "libopenvas_wmiclient-devel libopenvas_wmiclient-devel(aarch-64) pkgconfig(libopenvas_wmiclient)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libopenvas_wmiclient1"

inherit rpm
