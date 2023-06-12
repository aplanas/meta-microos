SUMMARY = "BSD Sendmail"
DESCRIPTION = "The 'Unix System Administration Handbook' calls sendmail 'The most \
complex and complete mail delivery system in common use...' . \
 \
Ready-made configuration files are included for systems connected by \
TCP/IP (with or without a name server) and for systems using UUCP. \
 \
'procmail' is used as a local mail agent. \
 \
'sendmail' is a trademark of Sendmail, Inc."
LICENSE = "Sendmail"

PV = "8.17.1"

RPM_NAME = "sendmail-8.17.1-9.1.aarch64.rpm"
RPM_HASH = "35943d352b6adf25f2661355563e46fcc60a665c314bef8c46ecf6b7bdeb302e9b0573b916a43a5ac25c090166988ff29ac1d8d31c5457061d1c752c4d2f4b71"

RPROVIDES:${PN} += "config(sendmail) sendcf sendmail sendmail(aarch-64) sendmail-tls smailcfg smtp_daemon"
RDEPENDS:${PN} += "/bin/bash /bin/fuser /bin/sh /usr/bin/mkdir /usr/bin/perl /usr/bin/touch coreutils filesystem fillup findutils group(daemon) group(mail) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libdb-4.8.so()(64bit) libicuuc.so.73()(64bit) liblber.so.2()(64bit) liblber.so.2(OPENLDAP_2.200)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libnss_usrfiles2 libsasl2.so.3()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libwrap.so.0()(64bit) m4 make netcfg permissions procmail sed user(daemon) user(mail)"

inherit rpm
