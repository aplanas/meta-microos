SUMMARY = "Unicode text editor"
DESCRIPTION = "yudit is a unicode package to edit and convert text of different \
languages."
LICENSE = "LGPL-2.1-or-later"

PV = "3.0.7"

RPM_NAME = "yudit-3.0.7-1.12.aarch64.rpm"
RPM_HASH = "ab01fab035f44e8f4ddaebf4bf82e034c128192615cd7761bb82da686fe7e4d0c23563f9543de60ee9703cf315afa25dad293ef9bc16616fc1d6b04913992a91"

RPROVIDES:${PN} += "config(yudit) \
yudit \
yudit(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
perl"

inherit rpm
