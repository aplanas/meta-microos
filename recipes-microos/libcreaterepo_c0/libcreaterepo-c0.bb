SUMMARY = "Library for repodata manipulation"
DESCRIPTION = "Libraries for applications using the createrepo_c library \
for easy manipulation with a repodata."
LICENSE = "GPL-2.0-or-later"

PV = "0.20.1"

RPM_NAME = "libcreaterepo_c0-0.20.1-2.3.aarch64.rpm"
RPM_HASH = "bc93e10ffd21008534a6aca9ccd04740e15331a4cf6ec061f748e05779313150b2d917b646f09b53f870486e43b730eeb592da0481adb34bb4ad351f1f2445c8"

RPROVIDES:${PN} += "libcreaterepo_c.so.0()(64bit) libcreaterepo_c0 libcreaterepo_c0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libmagic.so.1()(64bit) libmodulemd.so.2()(64bit) librpm.so.9()(64bit) librpmio.so.9()(64bit) libsqlite3.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.3.5)(64bit) libzck.so.1()(64bit)"

inherit rpm
