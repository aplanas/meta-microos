SUMMARY = "Python 3 bindings for the createrepo_c library"
DESCRIPTION = "The Python 3 bindings for the createrepo_c library."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.1"

RPM_NAME = "python3-createrepo_c-0.20.1-2.3.aarch64.rpm"
RPM_HASH = "0655b69ad71070084a0196e8032c8673b60f13f864685db1f107a2cc33925da8ea22e8a35e82415c0868bfa2ad37325a86c8f7c1e7b18c4af39bcd6548f40cee"

RPROVIDES:${PN} += "python3-createrepo_c python3-createrepo_c(aarch-64) python3.10dist(createrepo-c) python3dist(createrepo-c)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcreaterepo_c.so.0()(64bit) libcreaterepo_c0(aarch-64) libglib-2.0.so.0()(64bit) libpython3.10.so.1.0()(64bit) python(abi)"

inherit rpm
