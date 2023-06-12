SUMMARY = "Example Files for LibTomCrypt"
DESCRIPTION = "LibTomCrypt is a fairly comprehensive, modular and portable cryptographic \
toolkit that provides developers with a vast array of well known published \
block ciphers, one-way hash functions, chaining modes, pseudo-random \
numbergenerators, public key cryptography and a plethora of other routines. \
 \
This package contains example *.c files showing how to use TomCrypt library."
LICENSE = "SUSE-Public-Domain"

PV = "1.18.2"

RPM_NAME = "libtomcrypt-examples-1.18.2-3.1.aarch64.rpm"
RPM_HASH = "ba1609a8ba27aafa6c8948d3771dba241365e9a1b123a01327729105e4ee539de2565363d76b452f33d566e1b69d0bbe25fc6e601f9cecf01bf16f35bc18a2da"

RPROVIDES:${PN} += "libtomcrypt-examples \
libtomcrypt-examples(aarch-64)"
RDEPENDS:${PN} += "libtomcrypt-devel"

inherit rpm
