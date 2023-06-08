SUMMARY = "Basic QA tests for the kernel"
DESCRIPTION = "This package is using the kernel compiled within Open Build Service(OBS) \
projects and runs basic tests."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "kernel-obs-qa-6.3.1-1.2.aarch64.rpm"
RPM_HASH = "d73a22252fcd42b7e4ac4b19a3d3ffc8ede0154ad258143552284c34a944a1e8f5f77719cf005d968752771d1c88330c8f4591d92c228da51c9376eba762e85d"

RPROVIDES:${PN} += "kernel-obs-qa kernel-obs-qa(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
