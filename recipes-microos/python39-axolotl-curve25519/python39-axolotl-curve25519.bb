SUMMARY = "A curve25519 Python wrapper with Ed25519 signatures"
DESCRIPTION = "This is a Python wrapper for the curve25519 library with Ed25519 \
signatures."
LICENSE = "BSD-3-Clause & GPL-3.0-only"

PV = "0.4.1.2"

RPM_NAME = "python39-axolotl-curve25519-0.4.1.2-1.7.aarch64.rpm"
RPM_HASH = "fe458256d2b154b820b5362fdab7132342c4f49475e2a5ccd5959d82e4a500e1f3258c4eba337a0e02a1e10231fd52a7db2eaa9ecc09e0b313156e9988cea463"

RPROVIDES:${PN} += "python3.9dist(python-axolotl-curve25519) python39-axolotl-curve25519 python39-axolotl-curve25519(aarch-64) python3dist(python-axolotl-curve25519)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
