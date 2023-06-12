SUMMARY = "Python bindings for SELinux's policy management library"
DESCRIPTION = "This package contains the Python bindings for developing \
SELinux policy management applications."
LICENSE = "LGPL-2.1-only"

PV = "3.5"

RPM_NAME = "python311-semanage-3.5-1.4.aarch64.rpm"
RPM_HASH = "448d4987ea091346fceb061d92b22c49fb0f303962abf24af9631a00c5f8a91687d6754d3a3f0717f883fd40f095aa95857c58d0869907ffa35f0b1f36967883"

RPROVIDES:${PN} += "python311-semanage \
python311-semanage(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libsemanage.so.2()(64bit) \
libsemanage.so.2(LIBSEMANAGE_1.0)(64bit) \
libsemanage.so.2(LIBSEMANAGE_1.1)(64bit) \
libsemanage.so.2(LIBSEMANAGE_3.4)(64bit) \
libsemanage2 \
python(abi)"

inherit rpm
