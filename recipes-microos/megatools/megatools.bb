SUMMARY = "CLI client for mega.co.nz"
DESCRIPTION = "Megatools allow you to copy individual files as well as entire directory trees \
to and from the cloud. You can also perform streaming downloads for example to \
preview videos and audio files, without needing to download the entire file. \
 \
You can register an account using a 'megareg' tool, with the benefit of having \
true control of your encryption keys. \
 \
Megatools are robust and optimized for fast operation - as fast as Mega servers \
allow. Memory requirements and CPU utilization are kept at minimum."
LICENSE = "GPL-2.0-or-later"

PV = "1.11.1"

RPM_NAME = "megatools-1.11.1-1.1.aarch64.rpm"
RPM_HASH = "852594791ee1af400d8f6ddb6fb13413c5cdab3141acb46d0bd26d8badee26c8a567cffd23ad9dba9c1e2716410780332aca00ae48292bdb54bf255836cdc85e"

RPROVIDES:${PN} += "megatools megatools(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig curl fuse glib-networking ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) openssl"

inherit rpm
