SUMMARY = "Tools to manipulate LDB files"
DESCRIPTION = "Tools to manipulate LDB files."
LICENSE = "LGPL-3.0-or-later"

PV = "2.7.2"

RPM_NAME = "ldb-tools-2.7.2-1.1.aarch64.rpm"
RPM_HASH = "6e9f865de25baeee4caa142c4140eef3a0f69d35f33dd8ac7d04860a6ecb699eb38ce5f507f331b86151dc1220efe9369051e4ab3a9337f3486f129ebcbb22a6"

RPROVIDES:${PN} += "ldb-tools \
ldb-tools(aarch-64) \
libldb-cmdline.so()(64bit) \
libldb-cmdline.so(LDB_2.7.2_LDB)(64bit)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libldb.so.2()(64bit) \
libldb.so.2(LDB_0.9.10)(64bit) \
libldb.so.2(LDB_0.9.15)(64bit) \
libldb.so.2(LDB_0.9.18)(64bit) \
libldb.so.2(LDB_0.9.19)(64bit) \
libldb.so.2(LDB_1.1.0)(64bit) \
libldb.so.2(LDB_1.1.5)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit)"

inherit rpm
