SUMMARY = "Low-level Python CFFI Bindings for Argon2"
DESCRIPTION = "argon2-cffi-bindings provides low-level CFFI bindings \
to the Argon2 password hashing algorithm."
LICENSE = "MIT"

PV = "21.2.0"

RPM_NAME = "python310-argon2-cffi-bindings-21.2.0-2.4.aarch64.rpm"
RPM_HASH = "27981f656395fdee81168a3f4fd042dc42385d36f71f95c159a7c529d8949a7aab12ebd6689fd9ec9dc121dcfc88836968daa1f87d4acf71e90b0e7deb0e6f1b"

RPROVIDES:${PN} += "python3-argon2-cffi-bindings python3-argon2_cffi_bindings python3.10dist(argon2-cffi-bindings) python310-argon2-cffi-bindings python310-argon2-cffi-bindings(aarch-64) python310-argon2_cffi_bindings python3dist(argon2-cffi-bindings)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libargon2.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310-cffi"

inherit rpm
