SUMMARY = "FUSE and NBD single file backing store via Amazon S3"
DESCRIPTION = "s3backer is a filesystem that contains a single file backed by the Amazon \
Simple Storage Service (Amazon S3).  As a filesystem, it is very simple: \
it provides a single normal file having a fixed size.  Underneath, the \
file is divided up into blocks, and the content of each block is stored \
in a unique Amazon S3 object.  In other words, what s3backer provides is \
really more like an S3-backed virtual hard disk device, rather than a \
filesystem. \
 \
In typical usage, a `normal' filesystem is mounted on top of the file \
exported by the s3backer filesystem using a loopback mount (or disk image \
mount on Mac OS X). \
 \
s3backer can also function as a Network Block Device (NBD) plug-in."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.2"

RPM_NAME = "s3backer-2.0.2-2.4.aarch64.rpm"
RPM_HASH = "916011affd16b7f9d5640e31d14fcb1f965d56eccef6ac65ebd2a8f92882591522483dcbd2da55969cea015705fd070a2d85ca43eb7de87bd871484fa7722d07"

RPROVIDES:${PN} += "s3backer \
s3backer(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libexpat.so.1()(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.5)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libfuse.so.2(FUSE_2.8)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
