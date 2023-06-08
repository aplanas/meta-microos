SUMMARY = "Python tools for Fedora's messaging infrastructure"
DESCRIPTION = "A set of Python tools for using Fedora's messaging infrastructure."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "python311-fedora-messaging-3.2.0-2.4.noarch.rpm"
RPM_HASH = "c78ec349f0f3bf899d807dc9af82d4ae1ba473739bf8d940b9da533bf2fbcf8dd3e461a82d70f256a57009a6522d00b964528d30ddbbcd90ae56080897d74ee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fedora-messaging) python311-fedora-messaging python3dist(fedora-messaging)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-Twisted python311-blinker python311-click python311-crochet python311-jsonschema python311-pika python311-pyOpenSSL python311-pytz python311-service_identity python311-toml update-alternatives"

inherit rpm
