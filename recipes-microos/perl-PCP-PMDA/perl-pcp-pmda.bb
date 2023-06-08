SUMMARY = "Performance Co-Pilot (PCP) Perl bindings and documentation"
DESCRIPTION = "The PCP::PMDA Perl module contains the language bindings for \
building Performance Metric Domain Agents (PMDAs) using Perl. \
Each PMDA exports performance data for one specific domain, for \
example the operating system kernel, Cisco routers, a database, \
an application, etc."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "perl-PCP-PMDA-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "3d18fc8a32f1c782f95ca0f4ce38c5ae6e0552ae006438b8d703ce68a91f9fbb3a7543a6451883dc70081c4837088d4fbd5126c9cc4fb3b5c3c3f483847c3495"

RPROVIDES:${PN} += "perl(PCP::PMDA) perl-PCP-PMDA perl-PCP-PMDA(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libpcp3 perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
