SUMMARY = "Perl interface for libapparmor functions"
DESCRIPTION = "This package provides the perl interface to AppArmor. It is used for perl \
applications interfacing with AppArmor."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "3.1.4"

RPM_NAME = "perl-apparmor-3.1.4-1.1.aarch64.rpm"
RPM_HASH = "c8dee524bb00c39ae6747c3b82bbf8627ad46b9835bae75331e7473d4937f47f2f40fd2f4eb283e1a1cc83b1f90e717e08317f0c00ab45e080527ffd3b0adaf6"

RPROVIDES:${PN} += "perl(LibAppArmor) \
perl(LibAppArmor::aa_log_record) \
perl(LibAppArmorc) \
perl-apparmor \
perl-apparmor(aarch-64) \
perl-libapparmor"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libapparmor.so.1()(64bit) \
libapparmor.so.1(APPARMOR_1.0)(64bit) \
libapparmor.so.1(APPARMOR_1.1)(64bit) \
libapparmor.so.1(APPARMOR_2.10)(64bit) \
libapparmor.so.1(APPARMOR_2.11)(64bit) \
libapparmor.so.1(APPARMOR_2.9)(64bit) \
libapparmor.so.1(PRIVATE)(64bit) \
libapparmor1 \
libc.so.6(GLIBC_2.17)(64bit) \
perl"

inherit rpm
