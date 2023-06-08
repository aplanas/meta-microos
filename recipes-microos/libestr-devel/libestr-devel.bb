SUMMARY = "String handling essentials development files"
DESCRIPTION = "This package provides files required for development with libestr, \
the string handling essentials library used by the rsyslog daemon."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.11"

RPM_NAME = "libestr-devel-0.1.11-1.16.aarch64.rpm"
RPM_HASH = "8fc2f281f92afef1abd4724c23ababcd9b8de91966d75f06f966bb225474808db603ca21db9d7008a61283c97ca9dad58951277a821d28c84c1f0a1baea26eba"

RPROVIDES:${PN} += "libestr-devel libestr-devel(aarch-64) pkgconfig(libestr)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libestr0"

inherit rpm
