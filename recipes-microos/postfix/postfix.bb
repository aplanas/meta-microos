SUMMARY = "A fast, secure, and flexible mailer"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-3.8.0-2.1.aarch64.rpm"
RPM_HASH = "e9245ffbdadffc07ab3ab8736d29898a15d2ac917c4fa86354837aa8fa119da82b1ca6bb7ea9ef5757b73d84ef195bd675d62e65327a8127a9335096fff61600"

RPROVIDES:${PN} += "config(postfix) group(maildrop) group(postfix) libpostfix-dns.so()(64bit) libpostfix-global.so()(64bit) libpostfix-master.so()(64bit) libpostfix-tls.so()(64bit) libpostfix-util.so()(64bit) postfix postfix(aarch-64) postfix-lmdb smtp_daemon user(postfix)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/ed /usr/bin/mkdir /usr/bin/touch fillup group(mail) iproute2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libicuuc.so.72()(64bit) liblmdb-0.9.30.so()(64bit) libpcre2-8.so.0()(64bit) libsasl2.so.3()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) perl permissions sysuser-shadow user(nobody)"

inherit rpm
