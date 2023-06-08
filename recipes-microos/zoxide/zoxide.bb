SUMMARY = "A smarter cd command"
DESCRIPTION = "zoxide is a smarter cd command, inspired by z and autojump. It remembers \
which directories you use most frequently, so you can 'jump' to them in \
just a few keystrokes."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "zoxide-0.9.1-1.1.aarch64.rpm"
RPM_HASH = "f7e8c62afef100b1824ba76f90d361e8b1bd29f4e608c2a262f62035af1dcf60dbbb6a27133487f1263ef8e17a6ca145cc86361fa1550eba815b35cc0779e8a7"

RPROVIDES:${PN} += "zoxide zoxide(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
