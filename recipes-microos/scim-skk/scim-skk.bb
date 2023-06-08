SUMMARY = "SKK Input Method Engine for SCIM"
DESCRIPTION = "SKK Input Method Engine for SCIM"
LICENSE = "GPL-2.0+"

PV = "0.5.2"

RPM_NAME = "scim-skk-0.5.2-318.29.aarch64.rpm"
RPM_HASH = "c9158fe6ad21bc474b0399de3489da3892e99c16a3bbf8ca69b08d78a48d449a408d0b9cdd11b111025f92df085f2c9a4f50f4a34fda65fd8a180fabfc99ea35"

RPROVIDES:${PN} += "scim-skk scim-skk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libscim-1.0.so.8()(64bit) libscim-1.0.so.8(LIBSCIM_1.0)(64bit) libscim-gtkutils-1.0.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) skkdic"

inherit rpm
