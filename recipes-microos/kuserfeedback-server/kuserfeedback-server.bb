SUMMARY = "Server component of kuserfeedback"
DESCRIPTION = "KUserFeedback is a framework which allows applications to collect user \
telemetry and feedback surveys. This package provides a server component \
used to collect telemetry and feedback."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "kuserfeedback-server-1.2.0-1.14.aarch64.rpm"
RPM_HASH = "0459bcb525fccdbb90b80e361036ec43245edda9d893933fecf1ecf4944a842d8dd3a1be3eae70e5aee09ee920310c445d7ff4444acfae6b1e38c3f13aeef974"

RPROVIDES:${PN} += "kuserfeedback-server kuserfeedback-server(aarch-64)"
RDEPENDS:${PN} += "(php-sqlite or php-mysql or php-pgsql) php"

inherit rpm
