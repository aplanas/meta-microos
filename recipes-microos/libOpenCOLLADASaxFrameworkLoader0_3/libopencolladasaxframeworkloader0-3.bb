SUMMARY = "Collada 3D import and export libraries"
DESCRIPTION = "COLLADA is a XML schema that enables digital asset exchange within \
the interactive 3D industry. OpenCOLLADA is a project providing \
libraries for 3D file interchange between applications like Blender. \
 \
COLLADASaxFrameworkLoader is a library that loads COLLADA files in a \
SAX-like manner into the data framework model and is used by \
COLLADASaxFrameworkLoader."
LICENSE = "MIT"

PV = "1.6.68"

RPM_NAME = "libOpenCOLLADASaxFrameworkLoader0_3-1.6.68-1.12.aarch64.rpm"
RPM_HASH = "9eb7344998b4373521806b1975760366fa6139d46bf939641c96ad5bdbb39acbb5b457c9afb7c8fd109ba1f91e43ab00b84dc27180bb158d7ddd0163150c08cf"

RPROVIDES:${PN} += "libOpenCOLLADASaxFrameworkLoader.so.0.3()(64bit) libOpenCOLLADASaxFrameworkLoader0_3 libOpenCOLLADASaxFrameworkLoader0_3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGeneratedSaxParser.so.0.3()(64bit) libMathMLSolver.so.0.3()(64bit) libOpenCOLLADABaseUtils.so.0.3()(64bit) libOpenCOLLADAFramework.so.0.3()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libpcre.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.10)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
