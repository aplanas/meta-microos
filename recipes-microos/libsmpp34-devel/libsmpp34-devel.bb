SUMMARY = "Development files for the SMPP-3.4 protocol library"
DESCRIPTION = "The library provides the PDU handling of the SMPP-3.4 protocol. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmpp34."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.1"

RPM_NAME = "libsmpp34-devel-1.14.1-1.9.aarch64.rpm"
RPM_HASH = "efc345d26b9ffcfd75704f62296fc264be22a34bcc7417a126e3485268392585b6a796ec9c9ac598967c2d629277d01de0de097ec669b7f054416285c101ac26"

RPROVIDES:${PN} += "libsmpp34-0-devel libsmpp34-devel libsmpp34-devel(aarch-64) pkgconfig(libsmpp34)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsmpp34-1"

inherit rpm
