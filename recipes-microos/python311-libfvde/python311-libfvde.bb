SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "libfvde is a library to access the File Vault Drive Encryption format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "python311-libfvde-20220915-3.11.aarch64.rpm"
RPM_HASH = "caaa41845fc9b10505dd3cfea2311c1279e8089524efe948d11bfb6fa33976fd3a7825d1a28572eee5885f7ef465b3982acae33ad2bc5ade9ea2938e9991ab15"

RPROVIDES:${PN} += "python311-libfvde python311-libfvde(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libfguid.so.1()(64bit) libfguid.so.1(V_20220113)(64bit) libfvde.so.1()(64bit) libfvde.so.1(V_20220915)(64bit) python(abi)"

inherit rpm
