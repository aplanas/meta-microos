SUMMARY = "Libcap utility programs"
DESCRIPTION = "This package contains utility programs handling capabilities via \
libcap."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.68"

RPM_NAME = "libcap-progs-2.68-1.1.aarch64.rpm"
RPM_HASH = "47aca9bf2235141b9f104b0f888d45809691aced0d63bb423332b085e8907e95b6ea1e79ce5208ac093fa470874715407e317f85416db3df20c09a51d1696fad"

RPROVIDES:${PN} += "libcap-progs libcap-progs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libcap2"

inherit rpm
