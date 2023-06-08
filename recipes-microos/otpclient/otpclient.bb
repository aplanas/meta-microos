SUMMARY = "Simple GTK+ client for managing TOTP and HOTP"
DESCRIPTION = "Highly secure and easy to use GTK+ software for two-factor authentication \
that supports both Time-based One-time Passwords (TOTP) and \
HMAC-Based One-Time Passwords (HOTP)."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.6"

RPM_NAME = "otpclient-3.1.6-1.2.aarch64.rpm"
RPM_HASH = "0050d81e61e156888c5b11bf0515dba679fc919ec20ea01e3504fa9c9ec8b0aefb85bec7db022067738c9f9a8cb97d158e61185e36c4f37b4881614d0e704c8b"

RPROVIDES:${PN} += "application() application(com.github.paolostivanin.OTPClient.desktop) metainfo() metainfo(com.github.paolostivanin.OTPClient.appdata.xml) otpclient otpclient(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcotp.so.2()(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libjansson.so.4()(64bit) libjansson.so.4(libjansson.so.4)(64bit) libpng16.so.16()(64bit) libpng16.so.16(PNG16_0)(64bit) libprotobuf-c.so.1()(64bit) libprotobuf-c.so.1(LIBPROTOBUF_C_1.0.0)(64bit) libprotobuf-c.so.1(LIBPROTOBUF_C_1.3.0)(64bit) libqrencode.so.4()(64bit) libsecret-1.so.0()(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libzbar.so.0()(64bit)"

inherit rpm
