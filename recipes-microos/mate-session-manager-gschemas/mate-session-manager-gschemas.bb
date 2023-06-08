SUMMARY = "MATE Session Manager GSchemas"
DESCRIPTION = "This package provides the GSettings schemas for \
MATE Session Manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-session-manager-gschemas-1.26.0-2.4.aarch64.rpm"
RPM_HASH = "931396a4794d41178d8f767b9d09ef57eaebe698c0515ad223a05baf48c5b9149a4da9d64bed9b8a594b66ce4e3f8c4eaef025db7cdfdce618f1741bb19486e3"

RPROVIDES:${PN} += "mate-session-manager-gschemas mate-session-manager-gschemas(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
