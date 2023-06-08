SUMMARY = "Reference implementation for configuration of YubiKeys"
DESCRIPTION = "Yubico's YubiKey can be re-programmed. This project provides a reference implementation for configuration of YubiKeys."
LICENSE = "BSD-2-Clause"

PV = "1.20.0"

RPM_NAME = "ykpers-1.20.0-3.7.aarch64.rpm"
RPM_HASH = "19e79150e3ac9a9f79360c1d060c6b2a5b9b10c922fc82a3e0901832fe344aa591ba1c9381639459e20efda3c7ef667d5accd29dce8a1afeb62d1ace9a9a1397"

RPROVIDES:${PN} += "ykpers ykpers(aarch-64) yubikey-personalization"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libykpers-1.so.1()(64bit) libykpers-1.so.1(LIBYKPERS_1.0)(64bit) libykpers-1.so.1(LIBYKPERS_1.10)(64bit) libykpers-1.so.1(LIBYKPERS_1.12)(64bit) libykpers-1.so.1(LIBYKPERS_1.13)(64bit) libykpers-1.so.1(LIBYKPERS_1.14)(64bit) libykpers-1.so.1(LIBYKPERS_1.15)(64bit) libykpers-1.so.1(LIBYKPERS_1.16)(64bit) libykpers-1.so.1(LIBYKPERS_1.17)(64bit) libykpers-1.so.1(LIBYKPERS_1.18)(64bit) libykpers-1.so.1(LIBYKPERS_1.19)(64bit) libykpers-1.so.1(LIBYKPERS_1.4)(64bit) libykpers-1.so.1(LIBYKPERS_1.5)(64bit) libykpers-1.so.1(LIBYKPERS_1.6)(64bit) libykpers-1.so.1(LIBYKPERS_1.7)(64bit) libykpers-1.so.1(LIBYKPERS_1.8)(64bit) libyubikey.so.0()(64bit) libyubikey.so.0(YUBIKEY_1.0)(64bit) libyubikey.so.0(YUBIKEY_1.5)(64bit)"

inherit rpm
