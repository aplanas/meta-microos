SUMMARY = "Supplies iSNS support for Linux kernel target"
DESCRIPTION = "Target-isns is an Internet Storage Name Service (iSNS) client for the \
Linux LIO iSCSI target. It allows to register LIO iSCSI targets to an \
iSNS server. \
 \
The iSNS protocol is specified in \
[RFC 4171](http://tools.ietf.org/html/rfc4171) and its purpose is to \
make easier to discover, manage, and configure iSCSI devices. With \
iSNS, iSCSI targets can be registered to a central iSNS server and \
initiators can be configured to discover the targets by asking the \
iSNS server."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.8"

RPM_NAME = "target-isns-0.6.8-2.12.aarch64.rpm"
RPM_HASH = "b96b459bbed4932e8673183ab00e69fd72a617c1b74fc814af007b6e6a37d0caa693e4c96d638cc0b012227384a15b1337c2ff17203a5c31ff8727977d41ce40"

RPROVIDES:${PN} += "config(target-isns) target-isns target-isns(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) systemd"

inherit rpm
