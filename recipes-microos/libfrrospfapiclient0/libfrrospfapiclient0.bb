SUMMARY = "API for FRRouting's OSPFv2 implementation"
DESCRIPTION = "This library contains part of the OSPFv2 implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrospfapiclient0-8.4-3.1.aarch64.rpm"
RPM_HASH = "4e80ae75ce61c0768f0a10d9fafd5212243b69144fd7efc03ea0064292f394c539f57c4c8b8086610aaaa156c614dad2b6cc5cd54fda6ace520723bd0e4f082f"

RPROVIDES:${PN} += "libfrrospfapiclient.so.0()(64bit) libfrrospfapiclient0 libfrrospfapiclient0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libfrr.so.0()(64bit)"

inherit rpm
