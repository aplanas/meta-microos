SUMMARY = "DWARF-related tools"
DESCRIPTION = "Contains dwarfdump, a tool to access DWARF debug information."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.0"

RPM_NAME = "libdwarf-tools-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "57ba54e527b3ff47363ccd077d4c65b1a89a521806040fa951847a1d691ba5e07652e809d64db9f316ac33e588b88a2996ba2ab45f19a56ff0d22c0fb277657e"

RPROVIDES:${PN} += "dwarfutils libdwarf-tools libdwarf-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdwarf.so.0()(64bit)"

inherit rpm
