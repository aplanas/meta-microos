SUMMARY = "Tool for launching and easy-updates of Tor Browser"
DESCRIPTION = "Tor Browser Launcher is intended to make Tor Browser easier to \
install and use for GNU/Linux users. You install \
torbrowser-launcher from your distribution's package manager and \
it handles everything else: \
  - Downloads and installs the most recent version of Tor Browser \
    in your language and for your computer's architecture, or \
    launches Tor Browser if it's already installed (Tor Browser \
    will automatically update itself) \
  - Certificate pins to https://www.torproject.org, so it doesn't \
    rely on certificate authorities \
  - Verifies Tor Browser's signature for you, to ensure the \
    version you downloaded was cryptographically signed by Tor \
    developers and was not tampered with \
  - Adds 'Tor Browser' and 'Tor Browser Launcher Settings' \
    application launcher to your desktop environment's menu \
  - Apparmor profile to limit effect of Tor network compromise \
  - Optionally plays a modem sound when you open Tor Browser \
    (because Tor is so slow)."
LICENSE = "MIT"

PV = "0.3.6"

RPM_NAME = "torbrowser-launcher-0.3.6-1.2.noarch.rpm"
RPM_HASH = "b0c1d9abf6ef882b9ce8b2f493abd229762ca759e653bc6eb8b030ccf886529d1ade9785f4ec86dc4cd63c47f25f7585357c66450d6a00672f99fa1b35c86929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() application(torbrowser-settings.desktop) application(torbrowser.desktop) metainfo() metainfo(torbrowser.appdata.xml) python3.10dist(torbrowser-launcher) python3dist(torbrowser-launcher) torbrowser-launcher"
RDEPENDS:${PN} += "/usr/bin/python3 gpg2 hicolor-icon-theme python(abi) python3-Parsley python3-PySocks python3-distro python3-gpg python3-packaging python3-qt5 python3-requests xmessage"

inherit rpm
