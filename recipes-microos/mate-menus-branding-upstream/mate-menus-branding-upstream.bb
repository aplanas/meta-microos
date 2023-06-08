SUMMARY = "Upstream menus definition for the MATE desktop menu"
DESCRIPTION = "The package contains an implementation of the draft 'Desktop Menu \
Specification' from freedesktop.org: \
 \
https://freedesktop.org/Standards/menu-spec \
 \
This package provides the upstream definitions for menus."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-menus-branding-upstream-1.26.0-1.8.noarch.rpm"
RPM_HASH = "1da6b0e212a78ab422ea4c8906a25ba9babda0e3c983cda2b4452e0bd374bbaa8a1b766367b0b9b23be51c80fe2a3ef4fefbd40a1e1e4d2fea3163c9717c0d19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(mate-menus-branding-upstream) mate-menus-branding mate-menus-branding-upstream"
RDEPENDS:${PN} += "mate-menus"

inherit rpm
