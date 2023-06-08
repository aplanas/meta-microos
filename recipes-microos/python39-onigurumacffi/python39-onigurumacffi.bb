SUMMARY = "Python cffi bindings for the oniguruma regex engine"
DESCRIPTION = "python cffi bindings for the oniguruma regex engine"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python39-onigurumacffi-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "410be6912423ecd1f810aa11947f06d45d02e8850faa9c4bdbf2f796dfa61564adc6c76c36763c3b4b5bd6cac722b278fee297aa369bcd0dfce60e4682eb74bc"

RPROVIDES:${PN} += "python3.9dist(onigurumacffi) python39-onigurumacffi python39-onigurumacffi(aarch-64) python3dist(onigurumacffi)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libonig.so.5()(64bit) python(abi) python39-cffi"

inherit rpm
