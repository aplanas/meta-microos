SUMMARY = "Ritchie - One CLI to rule them all"
DESCRIPTION = "Ritchie is an open source framework that creates and tweaks a CLI for your team. It allows you to easily create, build and share formulas. This package contains the CLI core, which can execute formulas stored inside other repositories such as ritchie-formulas."
LICENSE = "Apache-2.0"

PV = "2.11.3"

RPM_NAME = "ritchie-cli-2.11.3-2.9.aarch64.rpm"
RPM_HASH = "d252834b6761bcf8461abb217256be4cd187f03d2d17b1467a440140ee9ff84760dc20298a4b49b3afc2942d578f38b61f0f34f755bed538067378a0ac6456a6"

RPROVIDES:${PN} += "ritchie-cli ritchie-cli(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
