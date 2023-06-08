SUMMARY = "Backup program with deduplication and encryption"
DESCRIPTION = "restic is a backup program. It supports verification, encryption, \
snapshots and deduplication."
LICENSE = "BSD-2-Clause"

PV = "0.15.2"

RPM_NAME = "restic-0.15.2-1.1.aarch64.rpm"
RPM_HASH = "57831134f5fc61146ca06cf76982a6504e7138a1d0cc985daa921bf285df4e41ce2f6755f6966ae992e8eabbda64affaa8af282da4235939dc0b110d3dba1ae9"

RPROVIDES:${PN} += "restic restic(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
