SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220922"

RPM_NAME = "python39-libfwnt-20220922-2.5.aarch64.rpm"
RPM_HASH = "e9df69040766a009b85b0222b79445e0fa7a848863d6dba12745026bff2d43a1f420e24fbe23b21c88f6b487b8e78275446f6cdb55fce9b1dae47fd9805aec7a"

RPROVIDES:${PN} += "python39-libfwnt \
python39-libfwnt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfwnt.so.1()(64bit) \
libfwnt.so.1(V_20220922)(64bit) \
python(abi)"

inherit rpm
