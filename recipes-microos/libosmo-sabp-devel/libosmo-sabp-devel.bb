SUMMARY = "Header files for the Osmocom SABP library"
DESCRIPTION = "Osmocom code for the Service Area Broadcast Protocol interface. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-sabp."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "libosmo-sabp-devel-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "e025ecc71ffb7e805a776eee968993e29c052d5990078e836735cca627f7347f311db9b02935076f9871bb366a9b6bae7642571d9db4beb9310badcfc1ee4abc"

RPROVIDES:${PN} += "libosmo-sabp-devel libosmo-sabp-devel(aarch-64) pkgconfig(libosmo-sabp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libosmo-sabp1"

inherit rpm
