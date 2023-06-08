SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.86"

RPM_NAME = "skelcd-installer-MicroOS-17.86-1.29.aarch64.rpm"
RPM_HASH = "0d00498b5023a1377c29a93b460cd7a2f489a1f958f8bd36d577d91d9532f9b24f87c94ff338959a27f9c81fdc867ca4b8992b6ad1776c25812549594f98e18c"

RPROVIDES:${PN} += "skelcd-installer skelcd-installer-MicroOS skelcd-installer-MicroOS(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
