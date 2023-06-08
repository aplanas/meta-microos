SUMMARY = "Ruby interface for libapparmor functions"
DESCRIPTION = "This package provides the ruby interface to AppArmor. It is used for ruby \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.3"

RPM_NAME = "ruby-apparmor-3.1.3-2.1.aarch64.rpm"
RPM_HASH = "1fe7147e99e7a84336fa7a7a6d51899fca9e283663871283c0825a8ac996ac17871f9f56851d5ffa0442bccfda4e60d0a3e4c873af1a6759989aec8d7f480b82"

RPROVIDES:${PN} += "ruby-apparmor ruby-apparmor(aarch-64) ruby-libapparmor"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libapparmor.so.1()(64bit) libapparmor.so.1(APPARMOR_1.0)(64bit) libapparmor.so.1(APPARMOR_1.1)(64bit) libapparmor.so.1(APPARMOR_2.10)(64bit) libapparmor.so.1(APPARMOR_2.11)(64bit) libapparmor.so.1(APPARMOR_2.9)(64bit) libapparmor.so.1(PRIVATE)(64bit) libapparmor1 libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libruby3.2.so.3.2()(64bit) ruby"

inherit rpm
