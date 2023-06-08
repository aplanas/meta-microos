SUMMARY = "Original Branding for LibreOffice"
DESCRIPTION = "This package includes the original branding for the LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-branding-upstream-7.5.3.1-1.1.noarch.rpm"
RPM_HASH = "a4072d5857b7279daa97fd76aeedd92a775d66d2936850587a1329fb0fcc5427ce5fa76ae1d060bab07a32cd0f961a80719c36912c7d0f10597ee4aaa5de49b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-branding libreoffice-branding-SLE libreoffice-branding-openSUSE libreoffice-branding-upstream"
RDEPENDS:${PN} += ""

inherit rpm
