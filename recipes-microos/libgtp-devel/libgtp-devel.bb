SUMMARY = "Development files for the GTP library"
DESCRIPTION = "libgtp implements the GPRS Tunneling Protocol between SGSN and GGSN. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libgtp."
LICENSE = "GPL-2.0-only"

PV = "1.9.0"

RPM_NAME = "libgtp-devel-1.9.0-1.4.aarch64.rpm"
RPM_HASH = "cc520db34bfded51640556dc6c14aebada3380c4977dded19860cc7341dd0ab9edab29418f02dc3e13bf57db579c2c65825ca645703bf006a3efc54f9bde541c"

RPROVIDES:${PN} += "libgtp-devel libgtp-devel(aarch-64) pkgconfig(libgtp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libgtp6"

inherit rpm
