SUMMARY = "A PHP wrapper for libsmbclient"
DESCRIPTION = "smbclient is a PHP extension that uses Samba's libsmbclient library to provide \
Samba related functions and 'smb' streams to PHP programs."
LICENSE = "PHP-3.01"

PV = "1.1.1"

RPM_NAME = "php8-smbclient-1.1.1-1.2.aarch64.rpm"
RPM_HASH = "771bb456bc81cd25863cb959ee3043dee7ca48c146637dbb4f405aa7e2024205da2115427bfa3c8754838cd25197ea3ebb63b72ffd0b9f330ca098f138bc9849"

RPROVIDES:${PN} += "config(php8-smbclient) php-smbclient php8-smbclient php8-smbclient(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsmbclient.so.0()(64bit) libsmbclient.so.0(SMBCLIENT_0.1.0)(64bit) libsmbclient.so.0(SMBCLIENT_0.2.0)(64bit) libsmbclient.so.0(SMBCLIENT_0.5.0)(64bit) php(api) php(zend-abi)"

inherit rpm
