SUMMARY = "Advanced Linux Sound Architecture Library"
DESCRIPTION = "This package contains the library for ALSA, Advanced Linux Sound \
Architecture."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.9"

RPM_NAME = "libasound2-1.2.9-1.1.aarch64.rpm"
RPM_HASH = "5f1854f129f385d15384b50a655b2c474d6eceba5b57dc7a9a9298d89181acae5d4f95b317141d3fc6d2a8fed886047ee0e719500a5f5a2898ec984dfa200c7c"

RPROVIDES:${PN} += "alsa-lib libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libasound.so.2(ALSA_0.9.0rc8)(64bit) libasound.so.2(ALSA_0.9.3)(64bit) libasound.so.2(ALSA_0.9.5)(64bit) libasound.so.2(ALSA_0.9.7)(64bit) libasound.so.2(ALSA_1.1.6)(64bit) libasound.so.2(ALSA_1.2.6)(64bit) libasound.so.2(ALSA_1.2.9)(64bit) libasound2 libasound2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
