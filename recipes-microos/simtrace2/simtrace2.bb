SUMMARY = "Osmocom SIMtrace host utility"
DESCRIPTION = "Osmocom SIMtrace 2 is a software and hardware system for passively \
tracing SIM-ME communication between the SIM card and the mobile phone, \
and remote SIM operation. \
 \
This package contains SIMtrace 2 host utility."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "simtrace2-0.8.0-1.7.aarch64.rpm"
RPM_HASH = "f66a04412a54fb4309a2f63048248a9f1956581417194c10c790538357a0ec77316cee048686ce2d214605bcafb59fec76359ee03372af18437276011a3b44bf"

RPROVIDES:${PN} += "simtrace2 simtrace2(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libosmo-simtrace2.so.1()(64bit) libosmocore.so.19()(64bit) libosmosim.so.2()(64bit) libosmousb.so.0()(64bit) libusb-1.0.so.0()(64bit)"

inherit rpm
