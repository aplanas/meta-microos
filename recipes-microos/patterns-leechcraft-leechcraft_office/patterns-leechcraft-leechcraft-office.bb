SUMMARY = "leechcraft_office"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-leechcraft-leechcraft_office-20170319-1.15.aarch64.rpm"
RPM_HASH = "18cd9a60f4726cd3972036a199d6aea4deda6a988e6bcac6b690bce3de2faac0f9d7a78abc96c656fac59f956838ae3bcfb1f96ff1855f17fb4c5e9d786d6e89"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() patterns-leechcraft-leechcraft_office patterns-leechcraft-leechcraft_office(aarch-64)"
RDEPENDS:${PN} += "leechcraft pattern()"

inherit rpm
