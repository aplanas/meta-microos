SUMMARY = "Plotting Library for Python"
DESCRIPTION = "matplotlib is a python 2D plotting library which produces publication \
quality figures in a variety of hardcopy formats and interactive \
environments across platforms. matplotlib can be used in python \
scripts, the python and ipython shell (ala matlab or mathematica), web \
application servers, and six graphical user interface toolkits."
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "e2da5efa01c10f9c0d4086d4a8521f58a88c00ad47b4980f24afa579b2e2c90f091cfee077e738bf4f8444b155e265cbd5b9a9d6ceff1279e3ffe162b2ddedcb"

RPROVIDES:${PN} += "python3.11dist(matplotlib) python311-matplotlib python311-matplotlib(aarch-64) python311-matplotlib-gtk python3dist(matplotlib)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi) python311-Cycler python311-FontTools python311-Pillow python311-contourpy python311-kiwisolver python311-numpy python311-packaging python311-pyparsing python311-python-dateutil"

inherit rpm
