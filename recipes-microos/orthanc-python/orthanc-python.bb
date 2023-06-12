SUMMARY = "Python plugin for Orthanc"
DESCRIPTION = "This plugin can be used to write Orthanc plugins in Python instead of C++ \
See /usr/share/doc/packages/orthanc/orthanc-python-readme.openSUSE"
LICENSE = "AGPL-3.0-or-later"

PV = "4.0"

RPM_NAME = "orthanc-python-4.0-1.5.aarch64.rpm"
RPM_HASH = "20ca34ee88948b4386ac2d064b24288dc91f80d856f0465d8a8ffad442d1c610b46c7459fbfdca12cdfff6c96702ba822f6525c9589aae161d909b889d3df9ef"

RPROVIDES:${PN} += "libOrthancPython.so.4.0()(64bit) \
orthanc-python \
orthanc-python(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_filesystem.so.1.82.0()(64bit) \
libboost_thread.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libjsoncpp.so.25()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
orthanc"

inherit rpm
