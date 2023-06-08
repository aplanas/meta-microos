SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains part of the mlag implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libmlag_pb0-8.4-3.1.aarch64.rpm"
RPM_HASH = "124909b811a9a722190f5d4d635a11a2aa92a2aec8d2adf2eba874489b6e6ae07ce06bf977f0f28f63ce58d9e1306016bc3426f93ffb0367fbb6870bd8cf2ac8"

RPROVIDES:${PN} += "libmlag_pb.so.0()(64bit) libmlag_pb0 libmlag_pb0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
