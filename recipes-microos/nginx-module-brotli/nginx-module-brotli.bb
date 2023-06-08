SUMMARY = "NGINX module for Brotli compression"
DESCRIPTION = "ngx_brotli is a set of two nginx modules: \
 \
ngx_brotli filter module - used to compress responses on-the-fly, \
ngx_brotli static module - used to serve pre-compressed files. \
 \
Brotli is a generic-purpose lossless compression algorithm that \
compresses data using a combination of a modern variant of the LZ77 \
algorithm, Huffman coding and 2nd order context modeling, with a \
compression ratio comparable to the best currently available \
general-purpose compression methods. It is similar in speed with \
deflate but offers more dense compression."
LICENSE = "BSD-2-Clause"

PV = "1.0.0rc+g1"

RPM_NAME = "nginx-module-brotli-1.0.0rc+g1-1.6.aarch64.rpm"
RPM_HASH = "cd6c8810cbd68d27cac0cc89012d48fdaab368a5aef0d48d3d6b82bf3c6b4ff24a1a6c5dbc615fda2fefcb28ebe07f3b6b9b6788af2aac013f367e6d43ec93a6"

RPROVIDES:${PN} += "nginx-module-brotli nginx-module-brotli(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrotlienc.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) nginx"

inherit rpm
