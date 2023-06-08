SUMMARY = "Base KDE PIM library for mail-handling applications"
DESCRIPTION = "The mailcommon library is a KDE PIM project to provide a \
framework to build applications which handle e-mail."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "mailcommon-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "cbd956edda4c31a3e4562b51d32744d5c9267816ab603b8bd4162bdc9942aebf5be61def9f08fc6c7f5340590894a9728b46a36e9955597c1f0f6bf04a1f445a"

RPROVIDES:${PN} += "mailcommon mailcommon(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
