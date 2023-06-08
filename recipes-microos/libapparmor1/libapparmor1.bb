SUMMARY = "Utility library for AppArmor"
DESCRIPTION = "This package provides the libapparmor library, which contains the \
change_hat(2) symbol, used for sub-process confinement by AppArmor, as \
well as functions to parse AppArmor log messages."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.3"

RPM_NAME = "libapparmor1-3.1.3-2.1.aarch64.rpm"
RPM_HASH = "1e7dbec3de9f709fa857ae18540e94a7e5075feb5fed38c3bc97766fc7bf15491ae98411f70d906f79734dce15c8e141822019b1bf326e80cd2a212b7809e444"

RPROVIDES:${PN} += "libapparmor libapparmor.so.1()(64bit) libapparmor.so.1(APPARMOR_1.0)(64bit) libapparmor.so.1(APPARMOR_1.1)(64bit) libapparmor.so.1(APPARMOR_2.10)(64bit) libapparmor.so.1(APPARMOR_2.11)(64bit) libapparmor.so.1(APPARMOR_2.13)(64bit) libapparmor.so.1(APPARMOR_2.13.1)(64bit) libapparmor.so.1(APPARMOR_2.9)(64bit) libapparmor.so.1(APPARMOR_3.0)(64bit) libapparmor.so.1(IMMUNIX_1.0)(64bit) libapparmor.so.1(PRIVATE)(64bit) libapparmor1 libapparmor1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
