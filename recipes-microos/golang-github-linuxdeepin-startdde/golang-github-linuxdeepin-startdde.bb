SUMMARY = "Startdde golang codes"
DESCRIPTION = "This package contains library source intended forbuilding other packages which \
use import path with pkg.deepin.io/dde/startdde prefix."
LICENSE = "GPL-3.0-or-later"

PV = "5.9.49"

RPM_NAME = "golang-github-linuxdeepin-startdde-5.9.49-2.3.noarch.rpm"
RPM_HASH = "c82117cce27b54430aa30083eb3623cdae34c8ca2d7eb23ef61f16ca9b97a5b44c73bcad2daead66d68950e0200f46f5ae1cd045e13dc2c9532f7183d89e9b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golang-github-linuxdeepin-startdde"
RDEPENDS:${PN} += "golang-github-linuxdeepin-dde-api golang-github-linuxdeepin-go-dbus-factory"

inherit rpm
