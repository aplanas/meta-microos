SUMMARY = "Improved implementation of Network Time Protocol"
DESCRIPTION = "A more secure implementation of NTP, derived from NTP Classic, Dave \
Mills’s original."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.2"

RPM_NAME = "ntpsec-1.2.2-1.3.aarch64.rpm"
RPM_HASH = "8497685b7fdbd79b0a7709039c4921439dffc7cd2b4648ffdf0d7bb60a920f2113281ef4e3a982c42d22c5702ce27d488376218bf088c2107be0011d1d2602ec"

RPROVIDES:${PN} += "config(ntpsec) ntp-daemon ntpsec ntpsec(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbsd.so.0()(64bit) libbsd.so.0(LIBBSD_0.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libdns_sd.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libnss_usrfiles2 libseccomp.so.2()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) netcfg ntpsec-utils user(ntp)"

inherit rpm
