SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender. \
 \
COLLADAStreamWriter contains the library to write COLLADA files."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libOpenCOLLADAStreamWriter0_3-1.6.68-1.12.aarch64.rpm"
RPM_HASH = "0620203c2569eea5e392c7b476e2229e9b15d6546fbb472e66073ca0a1df4c5397ff076ccd8ac8ab8948f283d467a3e82fa861117646c6aa6fbfa614906dbd5c"

RPROVIDES:${PN} += "libOpenCOLLADAStreamWriter.so.0.3()(64bit) libOpenCOLLADAStreamWriter0_3 libOpenCOLLADAStreamWriter0_3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libOpenCOLLADABaseUtils.so.0.3()(64bit) libbuffer.so.0.3()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
