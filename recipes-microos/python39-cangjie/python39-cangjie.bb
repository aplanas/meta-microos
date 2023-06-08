SUMMARY = "A python wrapper to libcangjie"
DESCRIPTION = "Python wrapper to libcangjie, the library implementing the Cangjie input method."
LICENSE = "LGPL-3.0-or-later"

PV = "1.3"

RPM_NAME = "python39-cangjie-1.3-2.4.aarch64.rpm"
RPM_HASH = "08df6e9ccad5d6a6cb415fa24e4d90065170cc7ee8de89292df6eadd145e028b591e0e00b3fcc13f4f90fa2e236988220b516fa2ab0c948a1d4792dd2c00f574"

RPROVIDES:${PN} += "python39-cangjie python39-cangjie(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcangjie-data libcangjie.so.2()(64bit) python(abi)"

inherit rpm
