SUMMARY = "Python library for calculating contours of 2D quadrilateral grids"
DESCRIPTION = "A Python library for calculating contours of 2D quadrilateral grids \
 \
It contains the 2005 and 2014 algorithms used in Matplotlib as well \
as a newer algorithm that includes more features and is available \
in both serial and multithreaded versions. It provides an easy way \
for Python libraries to use contouring algorithms without having \
to include Matplotlib as a dependency."
LICENSE = "BSD-3-Clause"

PV = "1.0.6"

RPM_NAME = "python310-contourpy-1.0.6-3.1.aarch64.rpm"
RPM_HASH = "902e426ebbe6893a198e34817d6e05c7070cacce5b681a38e3667c0631fa9bb83a886a2bb9d260c593203234b6ddf71df6558f986144633a7c79b69da08c513f"

RPROVIDES:${PN} += "python3-contourpy python3.10dist(contourpy) python310-contourpy python310-contourpy(aarch-64) python3dist(contourpy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi) python310-numpy"

inherit rpm
