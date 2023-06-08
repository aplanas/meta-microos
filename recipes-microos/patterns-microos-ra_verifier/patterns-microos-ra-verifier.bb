SUMMARY = "Remote Attestation (Verifier) Support"
DESCRIPTION = "Packages required to enable remote attestation via Keylime verifier on \
openSUSE MicroOS."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-ra_verifier-5.0-69.1.aarch64.rpm"
RPM_HASH = "e08d89f8ab0b49f4e75c627fa45ecf57153102697cccb77a982a832a22d5e631592973954e70c4740a909adb32371ed957494a49170ed26b6dd5ed720824c95b"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-ra_verifier patterns-microos-ra_verifier(aarch-64)"
RDEPENDS:${PN} += "keylime-firewalld keylime-registrar keylime-tenant keylime-verifier"

inherit rpm
