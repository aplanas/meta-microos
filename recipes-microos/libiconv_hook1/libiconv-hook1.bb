SUMMARY = "Extension of iconv for libapache-mod-encoding"
DESCRIPTION = "This code is an iconv-compatible interface routine for mod_encoding."
LICENSE = "OpenSSL"

PV = "0.0.20021209"

RPM_NAME = "libiconv_hook1-0.0.20021209-1.27.aarch64.rpm"
RPM_HASH = "7d8ee4245ed26f450390a0f4483e88730461ea42c5e450bdcb6a331435692318a392b9894dd8f342b6b6ee3b12d8366927090181e9e644980d17cc26d4324e33"

RPROVIDES:${PN} += "libiconv_hook.so.1()(64bit) libiconv_hook1 libiconv_hook1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
