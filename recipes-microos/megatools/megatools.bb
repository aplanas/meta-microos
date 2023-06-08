SUMMARY = "CLI client for mega.co.nz"
DESCRIPTION = "Megatools allow you to copy individual files as well as entire directory trees \
to and from the cloud. You can also perform streaming downloads for example to \
preview videos and audio files, without needing to download the entire file."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.3"

RPM_NAME = "megatools-1.10.3-1.14.aarch64.rpm"
RPM_HASH = "c2f20fc3f346f35430a789d02414430b0ba98b3ff0806c4f767f2369ea081f7d791b0dfe800c523a6719764c82a80184c899d9e5916f97eee606d7f6afbbaa4b"

RPROVIDES:${PN} += "megatools megatools(aarch-64)"
RDEPENDS:${PN} += "curl fuse glib-networking ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) openssl"

inherit rpm
