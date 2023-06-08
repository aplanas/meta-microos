SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libbuffer0_3-1.6.68-1.12.aarch64.rpm"
RPM_HASH = "ec0591b034fc78e4581f9ff89171e0a5df770487e91fe5fb3d276c34d11387d7f2608cb29f32931b38da19e6d36602d265712e0ef381397e9e4f002f4001a142"

RPROVIDES:${PN} += "libbuffer.so.0.3()(64bit) libbuffer0_3 libbuffer0_3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libUTF.so.0.3()(64bit) libc.so.6(GLIBC_2.17)(64bit) libftoa.so.0.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.10)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
