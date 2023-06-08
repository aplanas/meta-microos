SUMMARY = "Utility for IPMI Control"
DESCRIPTION = "This package contains a utility for interfacing with devices that \
support the Intelligent Platform Management Interface specification. \
IPMI is an open standard for machine health, inventory, and remote \
power control. \
 \
This utility can communicate with IPMI-enabled devices through either a \
kernel driver such as OpenIPMI or over the RMCP LAN protocol defined in \
the IPMI specification.  IPMIv2 adds support for encrypted LAN \
communications and remote Serial-over-LAN functionality. \
 \
It provides commands for reading the Sensor Data Repository (SDR) and \
displaying sensor values, displaying the contents of the System Event \
Log (SEL), printing Field Replaceable Unit (FRU) information, reading \
and setting LAN configuration, and chassis power control."
LICENSE = "BSD-3-Clause"

PV = "1.8.19.0.g19d7878"

RPM_NAME = "ipmitool-1.8.19.0.g19d7878-1.4.aarch64.rpm"
RPM_HASH = "b7928c9362a0034aebfbea38d53d57f4e370f693bbbf955de6eaf7995e168168dac73d5189268abcda5676caf9bc7f1e4f9f20a5bfe4363c7cde60c8b3bf3cd5"

RPROVIDES:${PN} += "config(ipmitool) ipmitool ipmitool(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libfreeipmi.so.17()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libreadline.so.8()(64bit)"

inherit rpm
