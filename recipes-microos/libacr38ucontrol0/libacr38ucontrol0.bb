SUMMARY = "Library for PC/SC IFD Handler for the ACR38 Smart Card Reader"
DESCRIPTION = "This package contains a driver for the ACR 38 smart card reader \
produced by ACS. \
 \
This driver is meant to be used with the PCSC-Lite daemon from the \
pcsc-lite package."
LICENSE = "GPL-2.0+"

PV = "1.7.11"

RPM_NAME = "libacr38ucontrol0-1.7.11-7.25.aarch64.rpm"
RPM_HASH = "97853e47d580e47aa03b2fd5919cbfa4d58662df0946e13ea4eece49eda2d3aa1b68f0676b471d407b589817d162a343befa0fee1cdee00e2f5e13ce70694370"

RPROVIDES:${PN} += "libacr38ucontrol.so.0()(64bit) libacr38ucontrol0 libacr38ucontrol0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpcsclite.so.1()(64bit)"

inherit rpm
