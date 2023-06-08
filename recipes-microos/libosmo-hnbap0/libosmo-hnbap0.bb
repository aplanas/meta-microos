SUMMARY = "Home Node B Application Part library"
DESCRIPTION = "Osmocom code for the Home Node B Application Part. HNBAP is a control protocol \
found in Home Node B networks on the Iu-h interface."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "libosmo-hnbap0-1.3.0-1.3.aarch64.rpm"
RPM_HASH = "fdb8390198399ca3b0fafa317980c55f79c34a740f7d97ac649a4dd407fcf42f1a414aab0c73046be78fef15ccf012fab1138d24f3e61dd58bb652660b4bd94e"

RPROVIDES:${PN} += "libosmo-hnbap.so.0()(64bit) libosmo-hnbap0 libosmo-hnbap0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasn1c.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libosmocore.so.19()(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
