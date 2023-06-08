SUMMARY = "Detection of SHA-1 collisions"
DESCRIPTION = "This command line tool was designed as near drop-in replacements for other sha1sum \
implementations. It will compute the SHA-1 hash of any given file and additionally \
will detect cryptanalytic collision attacks against SHA-1 present in each file. \
It is very fast and takes less than twice the amount of time as regular SHA-1."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "sha1collisiondetection-1.0.3-4.20.aarch64.rpm"
RPM_HASH = "28e1c27ea25ddc00b31291ed88a0162d28367124e7d03dfcecc9180fe050bf646657193e85fccd8561c0649f5459780893aff2e054107cf60acfa52ff8cc12cd"

RPROVIDES:${PN} += "sha1collisiondetection sha1collisiondetection(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libsha1detectcoll.so.1()(64bit)"

inherit rpm
