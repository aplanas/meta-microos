SUMMARY = "installer and related files needed on network medium"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the network install medium to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.87"

RPM_NAME = "skelcd-installer-net-openSUSE-17.87-1.8.aarch64.rpm"
RPM_HASH = "719d565064f940b0e88b88014b054adb5fbca29331490e81018b8db833046fd54c7dfc2fdbc581aed1aa2fa3740e101d964bb35a7a19c0412e5673ba41488ea0"

RPROVIDES:${PN} += "skelcd-installer skelcd-installer-net-openSUSE skelcd-installer-net-openSUSE(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
