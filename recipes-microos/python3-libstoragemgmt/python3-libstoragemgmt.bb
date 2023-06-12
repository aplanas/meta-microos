SUMMARY = "Python client libraries and plug-in support for libStorageMgmt"
DESCRIPTION = " \
 \
 \
 \
The python-libstoragemgmt package contains python client libraries as \
well as python framework support and open source plug-ins written in python. \
 \
 \
 \
 \
 \
Provides:       python3-libstoragemgmt < 1.9.8-1.1"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.9.8"

RPM_NAME = "python3-libstoragemgmt-1.9.8-1.1.aarch64.rpm"
RPM_HASH = "45f418dee14845295e0d9363c9138ca62b03e55930b9c61f403f15b4ec185ec80f8939ef3057788e5dc30e8cfdb6ef35b544c47cc362edbe6746b9cb2bbf827e"

RPROVIDES:${PN} += "config(python3-libstoragemgmt) \
python3-libstoragemgmt \
python3-libstoragemgmt(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstoragemgmt(aarch-64) \
libstoragemgmt.so.1()(64bit) \
python(abi)"

inherit rpm
