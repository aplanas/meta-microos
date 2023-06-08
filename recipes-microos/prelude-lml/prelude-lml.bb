SUMMARY = "The prelude log analyzer"
DESCRIPTION = "Prelude-LML is a log analyser that allows Prelude to collect and \
analyze information from all kind of applications emitting logs or \
syslog messages in order to detect suspicious activities and transform \
them into Prelude-IDMEF alerts. Prelude-LML handles events generated \
by a large set of applications"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-lml-5.2.0-2.8.aarch64.rpm"
RPM_HASH = "c2e52f6ba580324d15672f223c6be2ca8f526d80ad711b9997ed0e922155fd1b767b3ef2cb236ae46b02581c01c798a1dbdb942b1d95280b8baed2f4386753cf"

RPROVIDES:${PN} += "config(prelude-lml) prelude-lml prelude-lml(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libpcre.so.1()(64bit) libprelude.so.28()(64bit)"

inherit rpm
