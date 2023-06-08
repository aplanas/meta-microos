SUMMARY = "A Tool for Mirroring FTP and HTTP Servers"
DESCRIPTION = "Wget enables you to retrieve WWW documents or FTP files from a server. \
This can be done in script files or via the command line."
LICENSE = "GPL-3.0-or-later"

PV = "1.21.3"

RPM_NAME = "wget-1.21.3-1.9.aarch64.rpm"
RPM_HASH = "08774f16c94f3e26a316077a54d36f0d7c0d9206eeb191befe10bcbc267c1b3f3ae411cf79bab00702376221fa1897a3aee56b5811053095846667b40837270a"

RPROVIDES:${PN} += "config(wget) wget wget(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcares.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgpgme.so.11()(64bit) libgpgme.so.11(GPGME_1.0)(64bit) libgpgme.so.11(GPGME_1.1)(64bit) libidn2.so.0()(64bit) libidn2.so.0(IDN2_0.0.0)(64bit) libmetalink.so.3()(64bit) libpcre2-8.so.0()(64bit) libproxy.so.1()(64bit) libproxy.so.1(LIBPROXY_0.4.16)(64bit) libpsl.so.5()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libz.so.1()(64bit)"

inherit rpm
