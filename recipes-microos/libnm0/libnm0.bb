SUMMARY = "Convenience library for clients of NetworkManager"
DESCRIPTION = "This package contains the libraries that make it easier to use some \
Network Manager functionality from applications that use glib."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.42.6"

RPM_NAME = "libnm0-1.42.6-1.1.aarch64.rpm"
RPM_HASH = "b6084ab51f5153796691c24e99f2a54625ac74a9a6f6fa6740746610dcf4a6784c752cd07c920f9d37e2537695ee23aa3a2059085773959d5a5f23b4ed36fe83"

RPROVIDES:${PN} += "libnm.so.0()(64bit) libnm.so.0(libnm_1_0_0)(64bit) libnm.so.0(libnm_1_0_4)(64bit) libnm.so.0(libnm_1_0_6)(64bit) libnm.so.0(libnm_1_10_0)(64bit) libnm.so.0(libnm_1_10_14)(64bit) libnm.so.0(libnm_1_10_2)(64bit) libnm.so.0(libnm_1_12_0)(64bit) libnm.so.0(libnm_1_12_2)(64bit) libnm.so.0(libnm_1_14_0)(64bit) libnm.so.0(libnm_1_14_8)(64bit) libnm.so.0(libnm_1_16_0)(64bit) libnm.so.0(libnm_1_18_0)(64bit) libnm.so.0(libnm_1_20_0)(64bit) libnm.so.0(libnm_1_20_6)(64bit) libnm.so.0(libnm_1_22_0)(64bit) libnm.so.0(libnm_1_22_2)(64bit) libnm.so.0(libnm_1_22_8)(64bit) libnm.so.0(libnm_1_24_0)(64bit) libnm.so.0(libnm_1_26_0)(64bit) libnm.so.0(libnm_1_26_4)(64bit) libnm.so.0(libnm_1_28_0)(64bit) libnm.so.0(libnm_1_2_0)(64bit) libnm.so.0(libnm_1_2_4)(64bit) libnm.so.0(libnm_1_30_0)(64bit) libnm.so.0(libnm_1_30_8)(64bit) libnm.so.0(libnm_1_32_0)(64bit) libnm.so.0(libnm_1_32_4)(64bit) libnm.so.0(libnm_1_34_0)(64bit) libnm.so.0(libnm_1_36_0)(64bit) libnm.so.0(libnm_1_38_0)(64bit) libnm.so.0(libnm_1_40_0)(64bit) libnm.so.0(libnm_1_40_4)(64bit) libnm.so.0(libnm_1_42_0)(64bit) libnm.so.0(libnm_1_42_2)(64bit) libnm.so.0(libnm_1_4_0)(64bit) libnm.so.0(libnm_1_6_0)(64bit) libnm.so.0(libnm_1_8_0)(64bit) libnm0 libnm0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libnspr4.so()(64bit) libnss3.so()(64bit) libnss3.so(NSS_3.2)(64bit) libsmime3.so()(64bit) libsmime3.so(NSS_3.2)(64bit) libsmime3.so(NSS_3.4)(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
