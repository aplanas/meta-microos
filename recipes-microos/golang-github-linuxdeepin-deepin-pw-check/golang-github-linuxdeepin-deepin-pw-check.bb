SUMMARY = "Deepin-pw-check source"
DESCRIPTION = "This package contains source of deepin-pw-check \
libraries that are developed by the Go team but outside of the main source tree."
LICENSE = "GPL-3.0+"

PV = "5.1.16"

RPM_NAME = "golang-github-linuxdeepin-deepin-pw-check-5.1.16-1.4.noarch.rpm"
RPM_HASH = "43adde2216aa5cc9aedd3cbc56b226c161399c4fb062be42f6960cb37f7807292db60253a93681c1e2c983e9bc589938713e193fdddb28ce5325ffe7275687e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-deepin-pw-check"
RDEPENDS:${PN} += "golang-github-linuxdeepin-go-dbus-factory"

inherit rpm
