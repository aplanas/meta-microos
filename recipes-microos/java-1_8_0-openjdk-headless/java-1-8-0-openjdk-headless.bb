SUMMARY = "OpenJDK 8 Runtime Environment"
DESCRIPTION = "The OpenJDK 8 runtime environment without audio and video support."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-WITH-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & SUSE-Public-Domain & W3C"

PV = "1.8.0.372"

RPM_NAME = "java-1_8_0-openjdk-headless-1.8.0.372-1.1.aarch64.rpm"
RPM_HASH = "e88b95514f97c2f8c1e90a8a49afb7a014ff4627f596c9a57894d49a618c282a8ed1f81ee3ba4672475e64745fd5edc94fcd1a5430e88a429998f8977429454b"

RPROVIDES:${PN} += "config(java-1_8_0-openjdk-headless) \
jaas \
java-1.8.0-headless \
java-1_8_0-openjdk-headless \
java-1_8_0-openjdk-headless(aarch-64) \
java-headless \
java-openjdk-headless \
java-sasl \
jce \
jdbc-stdext \
jndi \
jndi-cos \
jndi-dns \
jndi-ldap \
jndi-rmi \
jre-1.8.0-headless \
jre-1.8.0-openjdk-headless \
jre-headless \
jre-openjdk-headless \
jsse \
libattach.so()(64bit) \
libattach.so(SUNWprivate_1.1)(64bit) \
libawt.so()(64bit) \
libawt_headless.so()(64bit) \
libawt_headless.so(SUNWprivate_1.1)(64bit) \
libdt_socket.so()(64bit) \
libdt_socket.so(SUNWprivate_1.1)(64bit) \
libfontmanager.so()(64bit) \
libfontmanager.so(SUNWprivate_1.1)(64bit) \
libhprof.so()(64bit) \
libhprof.so(SUNWprivate_1.1)(64bit) \
libinstrument.so()(64bit) \
libinstrument.so(SUNWprivate_1.1)(64bit) \
libj2gss.so()(64bit) \
libj2gss.so(SUNWprivate_1.1)(64bit) \
libj2krb5.so()(64bit) \
libj2pcsc.so()(64bit) \
libj2pcsc.so(SUNWprivate_1.1)(64bit) \
libj2pkcs11.so()(64bit) \
libj2pkcs11.so(SUNWprivate_1.1)(64bit) \
libj2sctp.so()(64bit) \
libj2sctp.so(SUNWprivate_1.1)(64bit) \
libjaas_unix.so()(64bit) \
libjava.so()(64bit) \
libjava.so(SUNWprivate_1.1)(64bit) \
libjava_crw_demo.so()(64bit) \
libjava_crw_demo.so(SUNWprivate_1.1)(64bit) \
libjavajpeg.so()(64bit) \
libjavajpeg.so(SUNWprivate_1.1)(64bit) \
libjavalcms.so()(64bit) \
libjavalcms.so(SUNWprivate_1.1)(64bit) \
libjdwp.so()(64bit) \
libjdwp.so(SUNWprivate_1.1)(64bit) \
libjli.so()(64bit) \
libjli.so(SUNWprivate_1.1)(64bit) \
libjsdt.so()(64bit) \
libjsdt.so(SUNWprivate_1.1)(64bit) \
libjsig.so()(64bit) \
libjsound.so()(64bit) \
libjsound.so(SUNWprivate_1.1)(64bit) \
libjvm.so()(64bit) \
libjvm.so(SUNWprivate_1.1)(64bit) \
libmanagement.so()(64bit) \
libmanagement.so(SUNWprivate_1.1)(64bit) \
libmlib_image.so()(64bit) \
libmlib_image.so(SUNWprivate_1.1)(64bit) \
libnet.so()(64bit) \
libnet.so(SUNWprivate_1.1)(64bit) \
libnio.so()(64bit) \
libnio.so(SUNWprivate_1.1)(64bit) \
libnpt.so()(64bit) \
libnpt.so(SUNWprivate_1.1)(64bit) \
libsaproc.so()(64bit) \
libsaproc.so(SUNWprivate_1.1)(64bit) \
libsunec.so()(64bit) \
libsunec.so(SUNWprivate_1.1)(64bit) \
libsystemconf.so()(64bit) \
libsystemconf.so(SUNWprivate_1.1)(64bit) \
libunpack.so()(64bit) \
libunpack.so(SUNWprivate_1.1)(64bit) \
libverify.so()(64bit) \
libverify.so(SUNWprivate_1.1)(64bit) \
libzip.so()(64bit) \
libzip.so(SUNWprivate_1.1)(64bit)"
RDEPENDS:${PN} += "/bin/sh \
jpackage-utils \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpcsclite.so.1()(64bit) \
libsctp.so.1()(64bit) \
libsctp.so.1(VERS_1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libthread_db.so.1()(64bit) \
libthread_db.so.1(GLIBC_2.17)(64bit) \
libz.so.1()(64bit) \
mozilla-nss \
update-alternatives"

inherit rpm
