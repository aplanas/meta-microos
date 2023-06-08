SUMMARY = "Performance Co-Pilot (PCP) metrics for RabbitMQ queues"
DESCRIPTION = "This package contains the PCP Performance Metrics Domain Agent (PMDA) for \
collecting metrics about RabbitMQ message queues."
LICENSE = "GPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-pmda-rabbitmq-5.2.5-3.4.aarch64.rpm"
RPM_HASH = "9cbf614a968b30deccacecbf4227f87464fa895ada7b71e02a0a7963c82639c10e10914e9faba9862b5aaa28613854da3668d64a2405dc44ca76f654da9e080f"

RPROVIDES:${PN} += "pcp-pmda-rabbitmq pcp-pmda-rabbitmq(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/env python3-pcp"

inherit rpm
