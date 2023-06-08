SUMMARY = "Metadata 'tagging' library based on TagLib"
DESCRIPTION = "pytaglib is an audio metadata (“tag”) library for Python. \
It relies on the TagLib C++ library."
LICENSE = "GPL-3.0-only | MIT"

PV = "1.5.0"

RPM_NAME = "python310-pytaglib-1.5.0-1.5.aarch64.rpm"
RPM_HASH = "5d1933b3e0bf5a9680caed8cccb7fd7221c352523d15639241895b789016ce3a8e338603a8b9d5a66b819290791e171b96f2de4c0ac46ce2966271a8a21492cb"

RPROVIDES:${PN} += "python3-pytaglib python3.10dist(pytaglib) python310-pytaglib python310-pytaglib(aarch-64) python3dist(pytaglib)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libtag.so.1()(64bit) python(abi) python310-setuptools update-alternatives"

inherit rpm
