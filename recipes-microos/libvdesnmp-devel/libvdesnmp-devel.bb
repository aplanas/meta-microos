SUMMARY = "VDE SNMP header files"
DESCRIPTION = "This package contains VDE SNMP header files."
LICENSE = "GPL-2.0"

PV = "2.3.2+svn587"

RPM_NAME = "libvdesnmp-devel-2.3.2+svn587-3.23.aarch64.rpm"
RPM_HASH = "658421b017ea746c93dc86f0798a9af3a6ed77e6360eec2b11c16ca74372a0f9c94586ec750493b97029f126ad1788c31625d6675adce3dccab7aada058f8931"

RPROVIDES:${PN} += "libvdesnmp-devel libvdesnmp-devel(aarch-64) libvdesnmp0-devel pkgconfig(vdesnmp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libvdesnmp0 vde2"

inherit rpm
