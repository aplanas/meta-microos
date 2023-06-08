SUMMARY = "Development package for kdb"
DESCRIPTION = "The development package for the database connectivity and creation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-devel-3.2.0-7.16.aarch64.rpm"
RPM_HASH = "f901b8e3eff04d576a27be954d9d62553c96d63b49f93d85e295d1de99582649fd9b60177b14874d1c0d85495d3238441cbef94541613674b53c08e072d4fb77"

RPROVIDES:${PN} += "cmake(KDb) kdb-devel kdb-devel(aarch-64)"
RDEPENDS:${PN} += "libKDb3-4"

inherit rpm
