SUMMARY = "Mail import functionality for KDE PIM applications"
DESCRIPTION = "The mailimporter library is a KDE PIM project to provide a framework \
for importing mail from different formats into Mail User Agents such as \
KMail or Kontact."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "mailimporter-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "4f81a8f8bbf5dfcb76eeca2faa05285c54d7032c41dc68db1b6d06ad92ab4685e62ef9309ac78b3e7e74ed4dbb2ff38e8f26fb59dd33fb4d3ce7874518ee9f86"

RPROVIDES:${PN} += "mailimporter mailimporter(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
