SUMMARY = "Client for MinIO"
DESCRIPTION = "MinIO Client is a replacement for ls, cp, mkdir, diff and rsync commands for filesystems and object storage. \
 \
Please note: In contrast to upstream this package provides the executable as `minio-client`."
LICENSE = "AGPL-3.0-only"

PV = "20230526T233154Z"

RPM_NAME = "minio-client-20230526T233154Z-1.1.aarch64.rpm"
RPM_HASH = "99a9e7a131c7053d3ee4dc001beb937f4a0c44d889d4f81055623da83349e6ce959ed97738d573e8b49500bb12aac53b1723c385c407746198d2f65dfc55353a"

RPROVIDES:${PN} += "minio-client minio-client(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
