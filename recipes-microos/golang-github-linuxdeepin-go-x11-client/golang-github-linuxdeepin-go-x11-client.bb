SUMMARY = "Additional golang-github-linuxdeepin-go-x11-client libraries"
DESCRIPTION = "This package contains additional golang-github-linuxdeepin-go-x11-client \
libraries that are developed by the Go team but outside of the main source tree."
LICENSE = "GPL-3.0+"

PV = "0.6.9"

RPM_NAME = "golang-github-linuxdeepin-go-x11-client-0.6.9-1.7.noarch.rpm"
RPM_HASH = "280b0b1750271c30a3624b9fad0500e62f0e26a626de9bb2b0b0560da213f145cc914f59a11910ba159199505afee0304a7560b8181ef25b98d406651b9c5163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-go-x11-client"
RDEPENDS:${PN} += "golang-github-linuxdeepin-go-lib"

inherit rpm
