SUMMARY = "DWARF-related tools"
DESCRIPTION = "Contains dwarfdump, a tool to access DWARF debug information."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "libdwarf-tools-0.6.0-1.3.aarch64.rpm"
RPM_HASH = "877ba9d3f21752dbd92393e011bf226240b708dc2761cd9e2464f82c7e5f5b64e6f1e9aa0c8659a7c65000b3c4889393d102a8d16e04ef0e08074db29eac8ec1"

RPROVIDES:${PN} += "dwarfutils libdwarf-tools libdwarf-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdwarf.so.0()(64bit)"

inherit rpm
