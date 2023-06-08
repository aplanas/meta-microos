SUMMARY = "Hardware Support"
DESCRIPTION = "Packages required to install openSUSE MicroOS on real hardware."
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-hardware-5.0-69.1.aarch64.rpm"
RPM_HASH = "c74f9ed465f74a329a0323162a07d63136850affdbd56d6a033e76850cb0feef89c5cbc8043960991237940d03c0b83ce4704ceac3cc96c5536faa0933565d9f"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-icon() pattern-order() pattern-visible() patterns-microos-hardware patterns-microos-hardware(aarch-64)"
RDEPENDS:${PN} += "ethtool fcoe-utils hwinfo irqbalance"

inherit rpm
