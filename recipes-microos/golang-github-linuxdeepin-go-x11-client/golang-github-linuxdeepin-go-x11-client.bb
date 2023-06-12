SUMMARY = "Additional golang-github-linuxdeepin-go-x11-client libraries"
DESCRIPTION = "This package contains additional golang-github-linuxdeepin-go-x11-client \
libraries that are developed by the Go team but outside of the main source tree."
LICENSE = "GPL-3.0+"

PV = "0.6.9"

RPM_NAME = "golang-github-linuxdeepin-go-x11-client-0.6.9-1.8.noarch.rpm"
RPM_HASH = "3b1729fc52dbdd3788f71a248382888d19293fb57394a02ed92dbefae1d32800ac19392f7bcd46387aa00130a30da5088b50e8a259bdff19b7cf9a07211d3bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-go-x11-client"
RDEPENDS:${PN} += "golang-github-linuxdeepin-go-lib"

inherit rpm
