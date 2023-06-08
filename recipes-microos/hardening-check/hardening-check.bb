SUMMARY = "A tool for inspecting low-level hardening characteristics of ELF binaries"
DESCRIPTION = "This package contains a Perl script that allows checking \
a number of hardening characteristics of ELF binaries. \
 \
This includes checks for PIE executables, stack protection, source \
fortification, read-only relocations and immediate binding."
LICENSE = "GPL-2.0+"

PV = "2.6"

RPM_NAME = "hardening-check-2.6-3.18.aarch64.rpm"
RPM_HASH = "9975b38dc2dcd3ca3a6c96613ae3e1a98ab1d37707dc692476908868dffc3cde4cbad7c401867b498ed03e6c4ff0eaf2761c9d240da1e25791a7ff00c39b78f1"

RPROVIDES:${PN} += "hardening-check hardening-check(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl perl"

inherit rpm
