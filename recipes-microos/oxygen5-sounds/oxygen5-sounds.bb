SUMMARY = "Oxygen sounds"
DESCRIPTION = "This package contains the default sound set for a KDE Plasma workspace."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "oxygen5-sounds-5.27.4-1.1.noarch.rpm"
RPM_HASH = "9392efea98430d2979e0d8e4d5f578f68da26a9249d7e847432b9daedb66a6d3b283d384c960f2ad5aa6fc369a2a37c351b7c95985f20d11d5d5fe2694df0565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-sounds5 oxygen5-sounds"
RDEPENDS:${PN} += ""

inherit rpm
