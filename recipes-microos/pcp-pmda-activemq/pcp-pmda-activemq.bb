SUMMARY = "Performance Co-Pilot (PCP) metrics for ActiveMQ"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about the ActiveMQ message broker."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-activemq-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "604ff6760c0210465929594d2172266a8504ed5da886a0b19570abb57eeb4382c51084e331072e01beeead442abdc8f85beff310fe690d06db53fd7be6e26a23"

RPROVIDES:${PN} += "pcp-pmda-activemq pcp-pmda-activemq(aarch-64) perl(PCP::ActiveMQ) perl(PCP::Cache) perl(PCP::JVMGarbageCollection) perl(PCP::JVMMemory) perl(PCP::JVMMemoryPool) perl(PCP::Queue) perl(PCP::RESTClient) perl(PCP::TimeSource)"
RDEPENDS:${PN} += "/bin/sh perl(LWP::UserAgent) perl-PCP-PMDA"

inherit rpm
