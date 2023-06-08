SUMMARY = "Development files for sispmctl"
DESCRIPTION = "Development files for the GEMBIRD Silver Shield PM device."
LICENSE = "GPL-2.0-only"

PV = "4.10"

RPM_NAME = "sispmctl-devel-4.10-1.2.aarch64.rpm"
RPM_HASH = "c20bd13f003a1854eb9de7278b2a07b505bc48735e8c8d00761bb83f72336e9afbe2fa1f1fe4a888a93fd4229f7738bf89cefdaa2dec9148834f074c0544bc8e"

RPROVIDES:${PN} += "sispmctl-devel sispmctl-devel(aarch-64)"
RDEPENDS:${PN} += "libsispmctl0"

inherit rpm
