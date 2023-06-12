SUMMARY = "Library providing the FAM File Alteration Monitor API"
DESCRIPTION = "This C library provides an API and ABI compatible file alteration \
monitor mechanism compatible with FAM, but not dependent on a system wide \
daemon."
LICENSE = "LGPL-2.1-only"

PV = "0.1.10"

RPM_NAME = "libgamin-1-0-0.1.10-18.1.aarch64.rpm"
RPM_HASH = "e05c8614b4672ec1004be426dfa08e587685ba0b5c9a26671bd7d626c7c78b157c74080aaff70301e61a0029bc051a579561d378109eedd444a62e7fd158b983"

RPROVIDES:${PN} += "libgamin \
libgamin-1-0 \
libgamin-1-0(aarch-64) \
libgamin-1.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
gamin-server \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
