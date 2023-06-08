SUMMARY = "Libraries for Sunpinyin"
DESCRIPTION = "Sunpinyin is a statistical language model based Chinese input method engine. to \
model the Chinese language, it use a backoff bigram and trigram language model."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.99.2"

RPM_NAME = "libsunpinyin3-2.0.99.2-2.2.aarch64.rpm"
RPM_HASH = "520176d5a3c603e534f8ac6cd24a0e977bee29eebf1c9a0a587316aca6a821979a875215562834aa75fccd153f344eafa00a85b6f7e508d9ab5327f660fb157d"

RPROVIDES:${PN} += "libsunpinyin.so.3()(64bit) libsunpinyin3 libsunpinyin3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) sunpinyin-data"

inherit rpm
