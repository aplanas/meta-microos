SUMMARY = "MIB files from net-snmp"
DESCRIPTION = "Net-SNMP is a suite of applications used to implement SNMP v1, SNMP v2c \
and SNMP v3 using both IPv4 and IPv6. The suite includes: \
 \
- An extensible agent for responding to SNMP queries including built-in \
  support for a wide range of MIB information modules \
- Command-line applications to retrieve and manipulate information from \
  SNMP-capable devices \
- A daemon application for receiving SNMP notifications \
- A library for developing new SNMP applications, with C and Perl APIs \
- A graphical MIB browser. \
 \
This package holds the MIB files from the net-snmp package."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.3"

RPM_NAME = "snmp-mibs-5.9.3-4.6.aarch64.rpm"
RPM_HASH = "3ce4cfd9d6c80167b2516c9b0126f5d36556017bfe14dbab912fdfdac1d5a4d2c802a6084c80f99de88234b40abb117ffb5426db06c0b2814f97acf68f6b4d63"

RPROVIDES:${PN} += "snmp-mibs snmp-mibs(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
