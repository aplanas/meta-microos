SUMMARY = "KDE PIM libraries MIME support"
DESCRIPTION = "This package contains the basic packages for KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kmime-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "0f5e1b87c6e97e8463ac05d99f9b7961a1c06a4a629fe9ea771c207ca00f5030a89de8c486220646a25f12593f1c48bbdda94048247249f58d8ab131af922a85"

RPROVIDES:${PN} += "kmime kmime(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
