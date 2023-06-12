SUMMARY = "A python wrapper to libcangjie"
DESCRIPTION = "Python wrapper to libcangjie, the library implementing the Cangjie input method."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python310-cangjie-1.3-2.4.aarch64.rpm"
RPM_HASH = "7e7a52e84e541be65ecadffcb5b3cae0b4aaaf7bd1351cfa3504079df593f3e17557e607f87b58ea9599788fd156e0dc2d2e6f724df0a3565a4d6a9a54372f21"

RPROVIDES:${PN} += "python3-cangjie \
python310-cangjie \
python310-cangjie(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcangjie-data \
libcangjie.so.2()(64bit) \
python(abi)"

inherit rpm
