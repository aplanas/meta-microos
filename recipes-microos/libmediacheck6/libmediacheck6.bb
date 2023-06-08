SUMMARY = "Library for checking SUSE installation media"
DESCRIPTION = "Library for checking SUSE installation media. Used by checkmedia and linuxrc."
LICENSE = "GPL-3.0-or-later"

PV = "6.1"

RPM_NAME = "libmediacheck6-6.1-2.7.aarch64.rpm"
RPM_HASH = "5dd7dd08c120de28969676ef595fae20574f64d1174a14e1db6e5bc899dbd51beda37e05a4d3ee9e812a1ba9faa8f4fc48d554ba47ce880a62fb03b364ae535a"

RPROVIDES:${PN} += "libmediacheck.so.6()(64bit) libmediacheck6 libmediacheck6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig gpg ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
