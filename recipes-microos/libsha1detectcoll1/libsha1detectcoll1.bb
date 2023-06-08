SUMMARY = "Library that can detect SHA-1 collisions"
DESCRIPTION = "This library was designed as near drop-in replacements for other sha1sum \
implementations. It will compute the SHA-1 hash of any given file and additionally \
will detect cryptanalytic collision attacks against SHA-1 present in each file. \
It is very fast and takes less than twice the amount of time as regular SHA-1."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "libsha1detectcoll1-1.0.3-4.20.aarch64.rpm"
RPM_HASH = "d0a47e1bc0e246159a133076d8152b6c55ef23cc7866c97c16a1d0c6a468debe20f5c1e04f9c3937547ca86b6eb42b715f95b470a0b45e5efce7fee538c3bf57"

RPROVIDES:${PN} += "libsha1detectcoll.so.1()(64bit) libsha1detectcoll1 libsha1detectcoll1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
