SUMMARY = "Suite for solving combinatorial optimization problems"
DESCRIPTION = "Development files (C/C++) for the OR-Tools suite."
LICENSE = "Apache-2.0"

PV = "9.4"

RPM_NAME = "google-or-tools-devel-9.4-2.9.aarch64.rpm"
RPM_HASH = "7439bf4426f410cb1bb3a80366f6fa0b1bac784e8a53a32955aa9762cd9247c31fdb9961c673a13303efda4c92c02a18abcef2e248705997782607fa6286b1b5"

RPROVIDES:${PN} += "cmake(ortools) google-or-tools-devel google-or-tools-devel(aarch-64)"
RDEPENDS:${PN} += "libortools9 libortools_flatzinc9"

inherit rpm
