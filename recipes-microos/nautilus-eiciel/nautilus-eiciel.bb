SUMMARY = "Nautilus ACL viewer and editor extension"
DESCRIPTION = "A Nautilus extension that allows viewing and editing ACL permissions."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.0.rc2"

RPM_NAME = "nautilus-eiciel-0.10.0.rc2-1.3.aarch64.rpm"
RPM_HASH = "37e8fed40a455c44a9982ea96d31e8f26c9cd40aff2646c087acbb3326b58b8150924a973fda40f7440e8fe8f8e68cd1cf5fa86e9d7f037af14c78520585ea33"

RPROVIDES:${PN} += "libeiciel-nautilus.so()(64bit) \
nautilus-eiciel \
nautilus-eiciel(aarch-64)"
RDEPENDS:${PN} += "eiciel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libacl.so.1()(64bit) \
libacl.so.1(ACL_1.0)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libglibmm-2.68.so.1()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnautilus-extension.so.4()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
