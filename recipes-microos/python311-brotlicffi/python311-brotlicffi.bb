SUMMARY = "Python CFFI bindings to the Brotli library"
DESCRIPTION = "Python CFFI bindings to the Brotli library"
LICENSE = "MIT"

PV = "1.0.9.2"

RPM_NAME = "python311-brotlicffi-1.0.9.2-1.11.aarch64.rpm"
RPM_HASH = "5d7c262a57763cc01c21e9e85f32091d3f01c6fd0f89c20e31622e57ee54f4fea7fd1980c20f222a72edd86c3b4542fea1ce25ebed2d54e22a23977b966bcda7"

RPROVIDES:${PN} += "python3.11dist(brotlicffi) python311-brotlicffi python311-brotlicffi(aarch-64) python3dist(brotlicffi)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311-cffi"

inherit rpm
