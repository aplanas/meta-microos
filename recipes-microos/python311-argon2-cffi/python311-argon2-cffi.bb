SUMMARY = "The Argon2 password hashing algorithm for Python"
DESCRIPTION = "A Python module that uses CFFI to access the Argon2 password hashing \
C library."
LICENSE = "MIT"

PV = "21.3.0"

RPM_NAME = "python311-argon2-cffi-21.3.0-2.2.aarch64.rpm"
RPM_HASH = "0d6793ad29809a2a3ae4861f92f6072f974583d2efebb46e00e9aec5200139553eef76f86001b1255ebdd43e978adef261f385c11f64de8a17e719ec1c128791"

RPROVIDES:${PN} += "python3.11dist(argon2-cffi) \
python311-argon2-cffi \
python311-argon2-cffi(aarch-64) \
python311-argon2_cffi \
python3dist(argon2-cffi)"
RDEPENDS:${PN} += "python(abi) \
python311-argon2-cffi-bindings"

inherit rpm
