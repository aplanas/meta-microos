SUMMARY = "Geographic Information Systems Extensions to PostgreSQL"
DESCRIPTION = "PostGIS is a spatial database extender for PostgreSQL object-relational \
database. It adds support for geographic objects allowing location queries \
to be run in SQL."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "postgresql13-postgis-3.2.4-1.5.aarch64.rpm"
RPM_HASH = "7aef674c900da4b429a2873deb229bb6ac0e161fffdc595a1da3763028f90b755f7d82c3cb12db9da9bda907981f6361f7ddfd89e25b9a7f848368d590a73741"

RPROVIDES:${PN} += "postgis postgresql13-address_standardizer postgresql13-postgis postgresql13-postgis(aarch-64) postgresql13-postgis-llvmjit"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSFCGAL.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdal.so.32()(64bit) libgeos_c.so.1()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpcre2-8.so.0()(64bit) libpq.so.5()(64bit) libproj.so.25()(64bit) libprotobuf-c.so.1()(64bit) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.2)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) postgresql13-server proj update-alternatives"

inherit rpm
