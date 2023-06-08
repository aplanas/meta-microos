SUMMARY = "Python binding to the Brotli library"
DESCRIPTION = "This library contains Python bindings for the reference Brotli \
encoder/decoder. \
This allows Python software to use the Brotli compression algorithm \
directly from Python code."
LICENSE = "MIT"

PV = "0.7.0"

RPM_NAME = "python311-brotlipy-0.7.0-6.1.aarch64.rpm"
RPM_HASH = "a997f0ca971af327c3dc16143595d93c4a57d1d43d85be7bb66d24d256c6e526dad1715be72fab0d6b29f7dbaa575aac6c6d73812e80ac4cd9c13652d78f240f"

RPROVIDES:${PN} += "python3.11dist(brotlipy) python311-brotlipy python311-brotlipy(aarch-64) python3dist(brotlipy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbrotlidec.so.1()(64bit) libbrotlienc.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311-cffi"

inherit rpm
