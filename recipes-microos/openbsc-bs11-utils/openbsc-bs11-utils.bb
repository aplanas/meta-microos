SUMMARY = "Command line utilities for Siemens BS-11 BTS"
DESCRIPTION = "There is a tool in this package for configuring the Siemens BS-11 BTS. \
Additionally, it contains one tool for making use of an ISDN-card and the \
public telephone network as frequency standard for the E1 line."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "openbsc-bs11-utils-1.4.1-1.9.aarch64.rpm"
RPM_HASH = "896c46c4b32023099642ee3cac23fd1807f367bbd4726629824cc8ada3ca8da6cefc3639af690f649d95660fa5e10e68c0af4e93613bb281d2bf5a31c53ad42a"

RPROVIDES:${PN} += "openbsc-bs11-utils openbsc-bs11-utils(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libosmoabis.so.10()(64bit) libosmocore.so.19()(64bit) libosmogsm.so.18()(64bit) libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
