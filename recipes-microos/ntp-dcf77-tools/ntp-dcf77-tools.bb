SUMMARY = "DCF77 related tools"
DESCRIPTION = "DCF77 related programs. \
 \
There are currently two tools: \
  * testdcf, a simple DCF77 raw impulse test program. \
  * dcfd, a simple DCF77 raw impulse receiver with NTP loopfilter \
    mechanics for synchronisation."
LICENSE = "BSD-3-Clause & MIT & BSD-4-Clause & GPL-2.0-only"

PV = "4.2.8p15"

RPM_NAME = "ntp-dcf77-tools-4.2.8p15-13.1.aarch64.rpm"
RPM_HASH = "56b77446608949dad134d701575020341dd08f620b62944d1378f9bbf6c6adfaec99471d41c48b8771db3cf8597c6dc2e0014d22e78ea92512332ea3ebc53047"

RPROVIDES:${PN} += "ntp-dcf77-tools ntp-dcf77-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
