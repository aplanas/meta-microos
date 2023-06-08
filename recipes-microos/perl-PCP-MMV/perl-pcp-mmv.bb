SUMMARY = "Performance Co-Pilot (PCP) Perl bindings for PCP Memory Mapped Values"
DESCRIPTION = "The PCP::MMV module contains the Perl language bindings for \
building scripts instrumented with the Performance Co-Pilot \
(PCP) Memory Mapped Value (MMV) mechanism. \
This mechanism allows arbitrary values to be exported from an \
instrumented script into the PCP infrastructure for monitoring \
and analysis with pmchart, pmie, pmlogger and other PCP tools."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "perl-PCP-MMV-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "afd9f172d3086845d249314ab8110d893db7eda6806329d11d031c3816a5f7a65524cf2b061d4100b5aa06a408accfd88f2ec2e7993f2572e05141ccb6e2c217"

RPROVIDES:${PN} += "perl(PCP::MMV) perl-PCP-MMV perl-PCP-MMV(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpcp3 perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
