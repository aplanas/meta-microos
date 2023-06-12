SUMMARY = "Python bindings for SELinux's policy management library"
DESCRIPTION = "This package contains the Python bindings for developing \
SELinux policy management applications."
LICENSE = "LGPL-2.1-only"

PV = "3.5"

RPM_NAME = "python310-semanage-3.5-1.4.aarch64.rpm"
RPM_HASH = "033b5da78503e06d790101c15fe42e8fefa33e5ea60e5e4bd25a8bd49fd83b0c56544fd69ad9b181623f8fe4450c7aeb897c3a0df845207997b5032c3d6961a6"

RPROVIDES:${PN} += "python3-semanage \
python310-semanage \
python310-semanage(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsemanage.so.2()(64bit) \
libsemanage.so.2(LIBSEMANAGE_1.0)(64bit) \
libsemanage.so.2(LIBSEMANAGE_1.1)(64bit) \
libsemanage.so.2(LIBSEMANAGE_3.4)(64bit) \
libsemanage2 \
python(abi)"

inherit rpm
