SUMMARY = "C bindings for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library written \
in C++ with language bindings for Python for example. It started out as the \
audio engine of the 3D modelling application Blender and is now released as \
a standalone library."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "libaudaspace-c1_4-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "40f250c946697d00d3e36ff566725d9a193ae10c89106d3295d17fca74e061a95dc09b8093bd0f25483556c9e57449940f8ad431f1f8963a8667382d89c89559"

RPROVIDES:${PN} += "libaudaspace-c.so.1.4()(64bit) libaudaspace-c1_4 libaudaspace-c1_4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaudaspace.so.1.4()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
