SUMMARY = "DSSSL Engine (development package)"
DESCRIPTION = "Libraries and includes to compile applications that use the OpenJade \
framework (package 'openjade')."
LICENSE = "MIT"

PV = "1.3.2"

RPM_NAME = "openjade-devel-1.3.2-373.7.aarch64.rpm"
RPM_HASH = "e4a55fd4d3258742f0573c92e031a648f02cb070457c1124100e8d44a56ed033178e5680d0c8d1e5ccf9f6fb64d279ea033b83d61f4f1eb0f71809848583280d"

RPROVIDES:${PN} += "openjade-devel \
openjade-devel(aarch-64)"
RDEPENDS:${PN} += "openjade"

inherit rpm
