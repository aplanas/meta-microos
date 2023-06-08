SUMMARY = "Python 3 bindings for the hawkey interface"
DESCRIPTION = "This package provides the Python 3 bindings for libdnf through \
the hawkey interface."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.0"

RPM_NAME = "python3-hawkey-0.70.0-1.3.aarch64.rpm"
RPM_HASH = "e8672dc9d08779ec485d5300f857c50199ed6a906b8da49b785ddedc8b28463b8ae3a3ba627d10c4aed44effb0efa931a998ffef33adcf44c56b16d447565774"

RPROVIDES:${PN} += "python3-hawkey python3-hawkey(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdnf.so.2()(64bit) libdnf2(aarch-64) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libpython3.10.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) python(abi) python3-libdnf(aarch-64)"

inherit rpm
