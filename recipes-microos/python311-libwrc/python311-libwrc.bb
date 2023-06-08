SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "python311-libwrc-20230318-1.2.aarch64.rpm"
RPM_HASH = "d8bf5219d33d4ecf43b9d7b1add1871a8cb95fc3c0e790be2f830bddaefd62961e1efd05d5ebc6fcf8a139dac471c3378501d493c933e3726a36cdff85258453"

RPROVIDES:${PN} += "python311-libwrc python311-libwrc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libwrc.so.1()(64bit) libwrc.so.1(V_20230318)(64bit) python(abi)"

inherit rpm
