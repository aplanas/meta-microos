SUMMARY = "Time Zone Descriptions"
DESCRIPTION = "These are configuration files that describe available time zones. You \
can select an appropriate time zone for your system with YaST."
LICENSE = "BSD-3-Clause & SUSE-Public-Domain"

PV = "2023c"

RPM_NAME = "timezone-2023c-1.1.aarch64.rpm"
RPM_HASH = "28fd13538bd21acddef11eb1d07d9936dfc500afed3fa33dea03f74e913a602e9959d2c8a41ca04de202e4af7ec3f0e50337a7131a20423e4201faeda1a41420"

RPROVIDES:${PN} += "config(timezone) timezone timezone(aarch-64)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
