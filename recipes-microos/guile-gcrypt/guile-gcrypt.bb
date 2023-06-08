SUMMARY = "Cryptography library for Guile using Libgcrypt"
DESCRIPTION = "Guile-Gcrypt provides a Guile 2.x interface to a subset of the GNU \
Libgcrypt crytographic library. It provides modules for cryptographic \
hash functions, message authentication codes (MAC), public-key cryptography, \
strong randomness, and more. It is implemented using the foreign function \
interface (FFI) of Guile."
LICENSE = "GPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "guile-gcrypt-0.4.0-1.2.aarch64.rpm"
RPM_HASH = "360dfc70560f7ac8441ed8fbeefbc6e4520cf970b3e28b843f4adbb213eebcdbca293f70bfce0dd7441235ee24c1919300f13bb5bcb0bf01a40dac9a04aad29c"

RPROVIDES:${PN} += "guile-gcrypt guile-gcrypt(aarch-64)"
RDEPENDS:${PN} += "/bin/sh guile libgcrypt-devel"

inherit rpm
