SUMMARY = "Perl5 SNMP Extension Module"
DESCRIPTION = "The Perl5 'SNMP' Extension Module v3.1.0 for the UCD SNMPv3 library."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.3"

RPM_NAME = "perl-SNMP-5.9.3-4.6.aarch64.rpm"
RPM_HASH = "7a522d38daefa01563bcd063ba85c146b861b3309cfbe086242e188bdd913630c35f1d4fbe07b3fe6ff54f939ffdf01d0678bc532d0f65abe1b02557a7b01c81"

RPROVIDES:${PN} += "perl(MakefileSubs) \
perl(NetSNMP::ASN) \
perl(NetSNMP::OID) \
perl(NetSNMP::TrapReceiver) \
perl(NetSNMP::agent) \
perl(NetSNMP::agent::Support) \
perl(NetSNMP::agent::default_store) \
perl(NetSNMP::agent::netsnmp_request_infoPtr) \
perl(NetSNMP::default_store) \
perl(SNMP) \
perl(SNMP::DEBUGGING) \
perl(SNMP::DEBUG_INTERNALS) \
perl(SNMP::DUMP_PACKET) \
perl(SNMP::MIB) \
perl(SNMP::MIB::MIB_OPTIONS) \
perl(SNMP::MIB::NODE) \
perl(SNMP::MIB::REPLACE_NEWER) \
perl(SNMP::MIB::SAVE_DESCR) \
perl(SNMP::Session) \
perl(SNMP::TrapSession) \
perl(SNMP::VarList) \
perl(SNMP::Varbind) \
perl-SNMP \
perl-SNMP(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libnetsnmp.so.40()(64bit) \
libnetsnmpagent.so.40()(64bit) \
libnetsnmptrapd.so.40()(64bit) \
net-snmp \
perl-base"

inherit rpm
