SUMMARY = "Library providing an interface atop libsolv"
DESCRIPTION = "This library provides an interface atop libsolv, and a high-level \
RPM package manager library interface."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.0"

RPM_NAME = "libdnf2-0.70.0-1.3.aarch64.rpm"
RPM_HASH = "4b27e70dff1a15520dc70b4435fd5b51944b85fc17018751f43edb12ec4fe81c9d630a81566278bf90c89de61a27a9ab51d9ee7318ba6a2aeef1fdb69a708323"

RPROVIDES:${PN} += "libdnf.so.2()(64bit) libdnf2 libdnf2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgpgme.so.11()(64bit) libgpgme.so.11(GPGME_1.0)(64bit) libgpgme.so.11(GPGME_1.1)(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libmodulemd.so.2()(64bit) libmodulemd2(aarch-64) librepo.so.0()(64bit) librepo0(aarch-64) librpm.so.9()(64bit) librpmio.so.9()(64bit) libsmartcols.so.1()(64bit) libsmartcols.so.1(SMARTCOLS_2.25)(64bit) libsmartcols.so.1(SMARTCOLS_2.28)(64bit) libsmartcols.so.1(SMARTCOLS_2.29)(64bit) libsmartcols.so.1(SMARTCOLS_2.30)(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.3.3)(64bit) libzstd.so.1()(64bit)"

inherit rpm
