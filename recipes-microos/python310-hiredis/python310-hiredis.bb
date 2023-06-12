SUMMARY = "Python wrapper for hiredis"
DESCRIPTION = "Python wrapper for hiredis C connector."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "python310-hiredis-2.2.2-2.3.aarch64.rpm"
RPM_HASH = "739d74d218a6d68a1a88fc64ce76acd0a2c8ad400c513d499593e8b80ada2e99ab5be8ebb5987665ef2b7c51bcb242e4ee8dd4797afe0650547bb33ee204d7a4"

RPROVIDES:${PN} += "python3-hiredis \
python3.10dist(hiredis) \
python310-hiredis \
python310-hiredis(aarch-64) \
python3dist(hiredis)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libhiredis.so.1.1.0()(64bit) \
python(abi)"

inherit rpm
