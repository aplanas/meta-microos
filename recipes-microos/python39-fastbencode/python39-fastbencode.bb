SUMMARY = "Implementation of the bencode serialization format"
DESCRIPTION = "fastbencode is an implementation of the bencode serialization format \
originally used by BitTorrent. \
 \
The package includes both a pure-Python version and an optional C extension \
based on Cython. Both provide the same functionality, but the C extension \
provides significantly better performance."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "python39-fastbencode-0.2-1.5.aarch64.rpm"
RPM_HASH = "c6593c2abff96474f5f703fe4ffa7c695674ac1beecc907d6d77eef6c40d52a78e81fb174c4d2a10ec9e9f468948ec7868b63b4c1ef29c24cf1e5b2760180761"

RPROVIDES:${PN} += "python3.9dist(fastbencode) python39-fastbencode python39-fastbencode(aarch-64) python3dist(fastbencode)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
