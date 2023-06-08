SUMMARY = "FUSE file system backed by Amazon S3 bucket"
DESCRIPTION = "FUSE-based file system backed by Amazon S3. Mount a bucket as a local \
file system read/write. Store files/folders natively and transparently"
LICENSE = "GPL-2.0-only"

PV = "1.91"

RPM_NAME = "s3fs-1.91-1.7.aarch64.rpm"
RPM_HASH = "755ffcce9da8233ffdb964f0d2478921fe56e00376c35acb5f983dd0ae1993ca6ef968f78d00f312af17a1ff2727b5aa480a031df8b44618677ae86e679c1733"

RPROVIDES:${PN} += "s3fs s3fs(aarch-64)"
RDEPENDS:${PN} += "fuse ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.2)(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libfuse.so.2(FUSE_2.8)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
