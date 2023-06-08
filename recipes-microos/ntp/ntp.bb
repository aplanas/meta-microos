SUMMARY = "Network Time Protocol daemon (version 4)"
DESCRIPTION = "The Network Time Protocol (NTP) is used to synchronize the time of a \
computer client or server to another server or reference time source, \
such as a radio, satellite receiver, or modem. \
 \
Ntpd is an operating system daemon that sets and maintains the system \
time-of-day synchronized with Internet standard time servers."
LICENSE = "BSD-3-Clause & MIT & BSD-4-Clause & GPL-2.0-only"

PV = "4.2.8p15"

RPM_NAME = "ntp-4.2.8p15-13.1.aarch64.rpm"
RPM_HASH = "0db30330784bc74e7a8417bd99af3528a1ffeb9a91e34186bf23ff6eae220924ce942ac2dce7b56173aa2e42ba1eafee020818a5dd93c37fd4825ac3260b52e1"

RPROVIDES:${PN} += "config(ntp) ntp ntp(aarch-64) ntp-daemon perl(NTP::Util) xntp xntp3"
RDEPENDS:${PN} += "/bin/bash /bin/logger /bin/sh /usr/bin/base64 /usr/bin/gawk /usr/bin/mkdir /usr/bin/perl /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libdns_sd.so.1()(64bit) libevent_core-2.1.so.7()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libreadline.so.8()(64bit) timezone user(ntp)"

inherit rpm
