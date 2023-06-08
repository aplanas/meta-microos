SUMMARY = "A fast, secure, and flexible mailer"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program with bdb support"
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-bdb-3.8.0-2.1.aarch64.rpm"
RPM_HASH = "78b29c716883168b33e60efe41f5d8720aebeaaf42409ed9488fb8b0c620fdc25637df15d371c89c7fcccd040d7f428b962168b7a32a90e985b6311662e56c73"

RPROVIDES:${PN} += "config(postfix-bdb) group(maildrop) group(postfix) libpostfix-dns.so()(64bit) libpostfix-global.so()(64bit) libpostfix-master.so()(64bit) libpostfix-tls.so()(64bit) libpostfix-util.so()(64bit) postfix-bdb postfix-bdb(aarch-64) smtp_daemon user(postfix)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/touch ed fillup group(mail) iproute2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libdb-4.8.so()(64bit) libicuuc.so.72()(64bit) libpcre2-8.so.0()(64bit) libsasl2.so.3()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) perl permissions sysuser-shadow user(nobody)"

inherit rpm
