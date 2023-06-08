SUMMARY = "A scalable, open extension to CGI"
DESCRIPTION = "FastCGI is a language independent, scalable, open extension to CGI that \
provides high performance without the limitations of server specific \
APIs."
LICENSE = "OML"

PV = "2.4.0"

RPM_NAME = "perl-FastCGI-2.4.0-172.30.aarch64.rpm"
RPM_HASH = "bde5ce47768105218665ad9eb94bdeb0c271111f0b67acabb2a537ff358b09f836f614516885569a8f0c90efb52adfa0ac723097b935e2d8c5ec6a8d7bb4a332"

RPROVIDES:${PN} += "perl(FCGI) perl(FCGI::Stream) perl-FastCGI perl-FastCGI(aarch-64)"
RDEPENDS:${PN} += "FastCGI ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.28)(64bit) perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
