SUMMARY = "Seat management daemon"
DESCRIPTION = "Seat management takes care of mediating access to shared devices (graphics, input), without requiring the applications needing access to be root."
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "seatd-0.6.4-1.7.aarch64.rpm"
RPM_HASH = "a9a627b4aa751a499f7169f050de4e47049798e87dbb980969d22943e783dabd0ca9666314f662cea71ea3292f7012b6d0ba7a60c0900b47c1f27606ff5a6664"

RPROVIDES:${PN} += "seatd seatd(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libseat1"

inherit rpm
