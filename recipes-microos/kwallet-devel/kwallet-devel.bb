SUMMARY = "Safe desktop-wide storage for passwords"
DESCRIPTION = "This framework contains two main components: \
* Interface to KWallet, the safe desktop-wide storage for passwords on KDE workspaces. \
* The kwalletd used to safely store the passwords on KDE work spaces. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kwallet-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "62cc46fc584ac1d7e75975ad2af69d46da0a0c74cd8f685570da9f46ab5eb2977a901c104a1329bb33f483876977d163b689669a106b873bb3816506fd6b4e78"

RPROVIDES:${PN} += "cmake(KF5Wallet) kwallet-devel kwallet-devel(aarch-64) kwallet-framework-devel"
RDEPENDS:${PN} += "cmake(Qt5Gui) extra-cmake-modules libKF5Wallet5 libkwalletbackend5-5"

inherit rpm
