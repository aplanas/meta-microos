SUMMARY = "openSUSE Branding of mate-menus"
DESCRIPTION = "This package provides the openSUSE definitions for menus."
LICENSE = "GPL-2.0+"

PV = "42.1"

RPM_NAME = "mate-menus-branding-openSUSE-42.1-5.3.noarch.rpm"
RPM_HASH = "41257f48eee7c6f54dbc0ba3eff3eb0660bd6d62b9709f40900fff3a9ec9cb1ee1113b1cc678f4170179a61f6c79855c5d657b585d602c461094c9324c12006a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(mate-menus-branding-openSUSE) mate-menus-branding mate-menus-branding-openSUSE"
RDEPENDS:${PN} += "mate-menus"

inherit rpm
