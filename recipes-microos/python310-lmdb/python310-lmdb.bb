SUMMARY = "Universal Python binding for the LMDB 'Lightning' Database"
DESCRIPTION = "This is a universal Python binding for the LMDB 'Lightning' Database. \
 \
LMDB is a tiny database with the following properties: \
  * Ordered map interface (keys are always lexicographically sorted). \
  * Reader/writer transactions: readers don’t block writers, \
    writers don’t block readers. \
    Each environment supports one concurrent write transaction. \
  * Cheap read transactions. \
  * Environments may be opened by multiple processes on the same host. \
  * Multiple named databases may be created with transactions covering \
    all named databases. \
  * Memory mapped, allowing for zero copy lookup and iteration. \
    This is optionally exposed to Python using the buffer() interface. \
  * Maintenance requires no external process or background threads. \
  * No application-level caching is required: \
    LMDB uses the operating system’s buffer cache."
LICENSE = "OLDAP-2.8"

PV = "1.4.1"

RPM_NAME = "python310-lmdb-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "cea9ea382cac18cbe4b035c4d2ff0255bf3911294a08d3352ca6486e879da7e13b6ace78f91968fbac0dd2ac3737a3ae2acae63e53eec3386028c149a3ecb6b9"

RPROVIDES:${PN} += "python3-lmdb python3.10dist(lmdb) python310-lmdb python310-lmdb(aarch-64) python3dist(lmdb)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) liblmdb-0.9.30.so()(64bit) python(abi)"

inherit rpm
