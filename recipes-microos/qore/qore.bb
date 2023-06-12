SUMMARY = "Multithreaded Programming Language"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "1.13.0"

RPM_NAME = "qore-1.13.0-1.4.aarch64.rpm"
RPM_HASH = "43d51992fae6009d8cd400202aba7fdc505d0d6828296f392a0301b940eeea14613ed92119a1719647d42a69305bf91b1ff22c4dae537d31c8ae7dccf4ca277e"

RPROVIDES:${PN} += "qore \
qore(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libqore.so.12()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
shared-mime-info"

inherit rpm
