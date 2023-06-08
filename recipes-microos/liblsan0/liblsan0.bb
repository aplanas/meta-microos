SUMMARY = "The GNU Compiler Leak Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=leak option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.0.1+git7231"

RPM_NAME = "liblsan0-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "676df0f4d722ec08b64c356738a2123c5c518d58c726fe9705f8cf694306f45eb426f720e70d7cddb1d1172fa7c367d6f5827d28b747c56b4cd74d1d650d9eee"

RPROVIDES:${PN} += "liblsan.so.0()(64bit) liblsan0 liblsan0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
