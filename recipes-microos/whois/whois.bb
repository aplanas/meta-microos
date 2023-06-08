SUMMARY = "Intelligent WHOIS client"
DESCRIPTION = "This package provides a commandline client for the WHOIS (RFC 3912) \
protocol, which queries online servers for information such as contact \
details for domains and IP address assignments. \
It can intelligently select the appropriate WHOIS server for most queries. \
 \
The package also contains mkpasswd, a features-rich front end to the \
password encryption function crypt(3)."
LICENSE = "GPL-2.0-or-later"

PV = "5.5.16"

RPM_NAME = "whois-5.5.16-1.2.aarch64.rpm"
RPM_HASH = "59e1e1a4be67f6e984383c5934ace385fbb480f96dfd8ab90da07db41c1eefb9c4e005571ccaf63a7faf092d9d30fc35e1342302074727228ded6d150bdb18c0"

RPROVIDES:${PN} += "ripe-whois-tools whois whois(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libidn2.so.0()(64bit) libidn2.so.0(IDN2_0.0.0)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
