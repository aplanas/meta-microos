SUMMARY = "Binary libraries for subunit"
DESCRIPTION = "Binary libraries for subunit"
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libsubunit0-1.4.2-2.2.aarch64.rpm"
RPM_HASH = "fddd16fb4fe67cfc4ccfa9d8d9d7a96dd0e2000d909b4a3da8850138f214a0743c6729e4dde35454424ff8bdcb7a4ef52902d5225db5aca0fde402d29cbd6faf"

RPROVIDES:${PN} += "libsubunit.so.0()(64bit) \
libsubunit0 \
libsubunit0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6(GLIBC_2.17)(64bit) \
subunit(aarch-64)"

inherit rpm
