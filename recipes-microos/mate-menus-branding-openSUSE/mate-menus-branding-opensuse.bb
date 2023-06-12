SUMMARY = "openSUSE Branding of mate-menus"
DESCRIPTION = "This package provides the openSUSE definitions for menus."
LICENSE = "GPL-2.0+"

PV = "42.1"

RPM_NAME = "mate-menus-branding-openSUSE-42.1-5.5.noarch.rpm"
RPM_HASH = "7ab326a2cd31111db51d5e36b39398bc09272e6e209f81322946e8ebefba5ae63a95e85798cfb8db5ac20eea75cacafb708f45d0f1c19fcb8330c8bcd41cc384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(mate-menus-branding-openSUSE) mate-menus-branding mate-menus-branding-openSUSE"
RDEPENDS:${PN} += "mate-menus"

inherit rpm
