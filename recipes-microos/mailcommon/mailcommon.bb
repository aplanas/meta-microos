SUMMARY = "Base KDE PIM library for mail-handling applications"
DESCRIPTION = "The mailcommon library is a KDE PIM project to provide a \
framework to build applications which handle e-mail."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "mailcommon-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "69592b6d5498bacfccdaee8c243e0d4f19bd227d8b05f63c5f6aed38f249ccd014e13d18c92c18e468b9b684c1e35c678a557889f9f415f4011fc290d1fec129"

RPROVIDES:${PN} += "mailcommon mailcommon(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
