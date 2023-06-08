SUMMARY = "Client for MinIO"
DESCRIPTION = "MinIO Client is a replacement for ls, cp, mkdir, diff and rsync commands for filesystems and object storage. \
 \
Please note: In contrast to upstream this package provides the executable as `minio-client`."
LICENSE = "AGPL-3.0-only"

PV = "20230504T181016Z"

RPM_NAME = "minio-client-20230504T181016Z-1.1.aarch64.rpm"
RPM_HASH = "e1fa039d75e6b1f1970b49c625b84acf1dfd674f23e3179d04051416f096cbd197d0352a7c2f10bd7c002e212d079cde7ba1deade4688c9b5a712a709623db04"

RPROVIDES:${PN} += "minio-client minio-client(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
