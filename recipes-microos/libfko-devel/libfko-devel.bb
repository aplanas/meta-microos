SUMMARY = "The Development Files for the Firewall Knock Operator Library"
DESCRIPTION = "The Firewall Knock Operator library, libfko, provides the Single Packet \
Authorization implementation and API for the other fwknop components. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfko."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.10"

RPM_NAME = "libfko-devel-2.6.10-3.8.aarch64.rpm"
RPM_HASH = "86ea1c897455b974f8b40176393fd17bb136240a54f858db31590486e8b62f7f4912e74ac281a139e77836bd4abb7fa206e5891ad3bc5e21c6d3f8b407014455"

RPROVIDES:${PN} += "libfko-devel libfko-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libfko3"

inherit rpm
