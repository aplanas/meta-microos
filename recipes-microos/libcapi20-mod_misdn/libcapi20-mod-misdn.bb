SUMMARY = "mISDN plugin for libcapi"
DESCRIPTION = "This package contain the CAPI 2.0 module for mISDN."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "2.1.0+2.0.22+git6"

RPM_NAME = "libcapi20-mod_misdn-2.1.0+2.0.22+git6-2.6.aarch64.rpm"
RPM_HASH = "ed868061da4cd0b01869907a60a9ee084a21e50840b5f762d9e54cf352c4c674ac86c4766dca981edbade897c71367b5a6ff15397934434817da748dfa568636"

RPROVIDES:${PN} += "lib_capi_mod_misdn.so.2()(64bit) libcapi20-mod_misdn libcapi20-mod_misdn(aarch-64)"
RDEPENDS:${PN} += "capi4linux ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcapi20.so.3()(64bit)"

inherit rpm
