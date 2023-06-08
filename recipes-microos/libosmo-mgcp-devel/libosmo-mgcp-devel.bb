SUMMARY = "Development files for Osmocom's Media Gateway server library"
DESCRIPTION = "Osmocom's Media Gateway Control Protocol server library. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-mgcp."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "libosmo-mgcp-devel-1.9.0-1.9.aarch64.rpm"
RPM_HASH = "52954f2ad0d1748a81be516c4ded9cded51049969addc22f3543c4d57dc3ae9ce6e3b1f73bcc81b1f8f3ddfd85f38eaef0a66e64b59293913a6876df7abd9311"

RPROVIDES:${PN} += "libosmo-mgcp-devel libosmo-mgcp-devel(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
