SUMMARY = "Deepin daemon golang codes"
DESCRIPTION = "This package contains library source intended forbuilding other packages which \
use import path with pkg.deepin.io/dde/daemon prefix."
LICENSE = "GPL-3.0-or-later"

PV = "5.14.45"

RPM_NAME = "golang-github-linuxdeepin-deepin-daemon-5.14.45-2.4.noarch.rpm"
RPM_HASH = "897363b8253a2097a6916e30d687753cd7c8317c5f9a9b73e591cf1fd026669ce96a58e07a37e89bc4cd6658924414a05d3b3ea0eb80bd3a020bebf400411b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-deepin-daemon"
RDEPENDS:${PN} += "golang-github-linuxdeepin-dde-api \
golang-github-linuxdeepin-go-dbus-factory"

inherit rpm
