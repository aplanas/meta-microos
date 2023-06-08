SUMMARY = "Python list-like structure which implements MutableSequence"
DESCRIPTION = "Python list-like structure which implements collections.abc.MutableSequence."
LICENSE = "Apache-2.0"

PV = "1.3.3"

RPM_NAME = "python310-frozenlist-1.3.3-2.1.aarch64.rpm"
RPM_HASH = "7ac08a545af43acd17d9af5b9b7f6adb8842d219d6f340c4ffd3eae00b3337e05269b603589d048ac93fe16f0cfc5f1d1ba7d286e17eec6d2982dd21955c8747"

RPROVIDES:${PN} += "python3-frozenlist python3.10dist(frozenlist) python310-frozenlist python310-frozenlist(aarch-64) python3dist(frozenlist)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
