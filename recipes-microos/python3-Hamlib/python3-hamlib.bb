SUMMARY = "Python 3 bindings for Hamlib"
DESCRIPTION = "Hamlib provide a programming interface for controlling radios and \
other shack hardware."
LICENSE = "LGPL-2.1-only"

PV = "4.5.5"

RPM_NAME = "python3-Hamlib-4.5.5-1.1.aarch64.rpm"
RPM_HASH = "d71c113b469193b5e3af71414bb5ddc83843296c569eb2e5fa97e598217bf4faa972e7b93ededeee3a41fa69925cd27618d1f780dfc02de3ed42027086392504"

RPROVIDES:${PN} += "python3-Hamlib python3-Hamlib(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libhamlib.so.4()(64bit) libpython3.10.so.1.0()(64bit) python(abi)"

inherit rpm
