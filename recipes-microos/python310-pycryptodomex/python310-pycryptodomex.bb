SUMMARY = "Cryptographic library for Python"
DESCRIPTION = "PyCryptodomex is a self-contained Python package of low-level \
cryptographic primitives. \
 \
Unlike PyCryptodome, it resides in its own namespace `Cryptodome`. \
 \
PyCryptodome is a fork of PyCrypto. It brings several enhancements \
with respect to the last official version of PyCrypto (2.6.1), \
for instance: \
 \
* Authenticated encryption modes (GCM, CCM, EAX, SIV, OCB) \
* Accelerated AES on Intel platforms via AES-NI \
* First class support for PyPy \
* Elliptic curves cryptography (NIST P-256 curve only) \
* Better and more compact API (`nonce` and `iv` attributes for \
  ciphers, automatic generation of random nonces and IVs, simplified \
  CTR cipher mode, and more) \
* SHA-3 (including SHAKE XOFs), SHA-512/t and BLAKE2 hash algorithms \
* Salsa20 and ChaCha20 stream ciphers \
* Poly1305 MAC \
* ChaCha20-Poly1305 authenticated cipher \
* scrypt and HKDF \
* Deterministic (EC)DSA \
* Password-protected PKCS#8 key containers \
* Shamir's Secret Sharing scheme \
* Random numbers get sourced directly from the OS (and not from a \
  CSPRNG in userspace) \
* Simplified install process, including better support for Windows \
* Cleaner RSA and DSA key generation (largely based on FIPS 186-4) \
* Major clean ups and simplification of the code base \
 \
PyCryptodomex is not a wrapper to a separate C library like *OpenSSL*. \
To the largest possible extent, algorithms are implemented in pure \
Python. Only the pieces that are extremely critical to performance \
(e.g. block ciphers) are implemented as C extensions."
LICENSE = "BSD-2-Clause"

PV = "3.16.0"

RPM_NAME = "python310-pycryptodomex-3.16.0-1.5.aarch64.rpm"
RPM_HASH = "19f12672f2b70ba2a737437b2f026ff417f8e4d0c95cbc6e30b4ad7ac9a45af1f0f167ceb2ff9ee83afe0d9d46a964ff90e75439f0f97e5e2e53d0966e2ff100"

RPROVIDES:${PN} += "python3-pycryptodomex python3.10dist(pycryptodomex) python310-pycryptodomex python310-pycryptodomex(aarch-64) python3dist(pycryptodomex)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
