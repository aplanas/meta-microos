SUMMARY = "Easy-to-use IPMI server management utilities"
DESCRIPTION = "The ipmiutil package provides easy-to-use utilities to view the SEL, \
perform an IPMI chassis reset, set up the IPMI LAN and Platform Event Filter \
entries to allow SNMP alerts, Serial-Over-LAN console, event daemon, and \
other IPMI tasks. \
These can be invoked with the metacommand ipmiutil, or via subcommand \
shortcuts as well.  IPMIUTIL can also write sensor thresholds, FRU asset tags, \
and has a full IPMI configuration save/restore. \
An IPMI driver can be provided by either the OpenIPMI driver (/dev/ipmi0) \
or the Intel IPMI driver (/dev/imb), etc.  If used locally and no driver is \
detected, ipmiutil will use user-space direct I/Os instead."
LICENSE = "BSD-3-Clause"

PV = "3.1.8"

RPM_NAME = "ipmiutil-3.1.8-1.4.aarch64.rpm"
RPM_HASH = "53c34d9f0a1a2a802e23c6b4b1a15e2a24c4a9a7c2348e6574ccf5a536f6464d1ad24df7c9c983dc12812931db0b322b89f85a3f9e700efa2d41020a316875b1"

RPROVIDES:${PN} += "ipmiutil ipmiutil(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit)"

inherit rpm
