SUMMARY = "FRRouting zeromq library"
DESCRIPTION = "This library contains part of the zermomq implementation of FRRouting."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "8.4"

RPM_NAME = "libfrrzmq0-8.4-3.1.aarch64.rpm"
RPM_HASH = "04d7e430c562948bf35e96832314791f2351f2effb176f2ea7fba1beef568d1b1ed7a6ba617d3a4807348edf3c3704fafe9709f03a6dfb404040c87c7c55678f"

RPROVIDES:${PN} += "libfrrzmq.so.0()(64bit) libfrrzmq0 libfrrzmq0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.17)(64bit) libzmq.so.5()(64bit)"

inherit rpm
