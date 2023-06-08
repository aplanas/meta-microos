SUMMARY = "FTP protocol support for PHP"
DESCRIPTION = "PHP functions for access to file servers speaking the File Transfer \
Protocol (FTP) as defined in RFC 959."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-ftp-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "3603a9c58351a70e09d7f52be8244b5bab85441554a214da2032a21a5a8a4cf2d0ddb59d9954b34cc8cb9e5b5f04ac67e4a71996f6aef234e6ebb694380e4773"

RPROVIDES:${PN} += "config(php8-ftp) php-ftp php8-ftp php8-ftp(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) php"

inherit rpm
