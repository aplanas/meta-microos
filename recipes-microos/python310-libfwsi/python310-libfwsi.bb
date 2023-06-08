SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230114"

RPM_NAME = "python310-libfwsi-20230114-1.4.aarch64.rpm"
RPM_HASH = "0126c467a64e897951d6ea1c0d231c9eca400ad3941d6d619fe2d989a7b442df0d080f4675e3ee66e4bf9618036ad9df4622f09728846e8253e76017406a26dc"

RPROVIDES:${PN} += "python3-libfwsi python310-libfwsi python310-libfwsi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libfguid.so.1()(64bit) libfguid.so.1(V_20220113)(64bit) libfwsi.so.1()(64bit) libfwsi.so.1(V_20230114)(64bit) python(abi)"

inherit rpm
