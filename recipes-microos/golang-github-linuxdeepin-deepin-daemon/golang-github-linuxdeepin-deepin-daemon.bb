SUMMARY = "Deepin daemon golang codes"
DESCRIPTION = "This package contains library source intended forbuilding other packages which \
use import path with pkg.deepin.io/dde/daemon prefix."
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "golang-github-linuxdeepin-deepin-daemon-5.14.45-2.3.noarch.rpm"
RPM_HASH = "4a9c99e73d22ff782cdb6379ecfb88045aaf545641ca5a073811c833c0d3a6a62e88c2c4895cc9088e1931d91593a5ec169a656a95495b64bb9a85bc0121465f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-deepin-daemon"
RDEPENDS:${PN} += "golang-github-linuxdeepin-dde-api golang-github-linuxdeepin-go-dbus-factory"

inherit rpm
