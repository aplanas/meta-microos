SUMMARY = "Python 3 library and command line tool for configuring a YubiKey"
DESCRIPTION = "Python 3 library and command line tool for configuring a YubiKey. \
YubiKey Manager (ykman) is a command line tool for configuring a YubiKey over \
all transports. It is capable of reading out device information as well as \
configuring several aspects of a YubiKey, including enabling or disabling \
connection transports an programming various types of credentials."
LICENSE = "BSD-2-Clause"

PV = "4.0.9"

RPM_NAME = "yubikey-manager-4.0.9-2.2.noarch.rpm"
RPM_HASH = "f8b61f87560cf92363d70f9f246a3fcbc277a973d3ec9c6f3f245630869b17ad41aa2947d5c9de4eff7966dbb278145c66f2cd6e2f34def1f5c5930c84fafa4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yubikey-manager \
python3.10dist(yubikey-manager) \
python3dist(yubikey-manager) \
yubikey-manager"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-click \
python3-cryptography \
python3-fido2 \
python3-pyscard"

inherit rpm
