SUMMARY = "Osmocom SNMP-like control interface library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
libosmoctrl is an SNMP-like control interface. In contrast to the VTY \
interface, the control interface is meant to be used by programs."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmoctrl0-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "671afd043a835da640a2da2ba37f0238b41d37fae74d1de6d380d6bcc0606d5907e77d5dda13b12e20b8d48abf368ba163c9184da4e756a20a650b0f840a7178"

RPROVIDES:${PN} += "libosmoctrl.so.0()(64bit) libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) libosmoctrl0 libosmoctrl0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libosmovty.so.9()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
