SUMMARY = "Empty package to ensure rebuilding rtla in OBS"
DESCRIPTION = "This is an empty package that ensures rtla is rebuilt every time \
kernel-default is rebuilt in OBS. \
 \
There is no reason to install this package."
LICENSE = "GPL-2.0-only"

PV = "6.3.1"

RPM_NAME = "rtla-rebuild-6.3.1-5.1.aarch64.rpm"
RPM_HASH = "f8ed83b4fffd7cf49a16f998b406d1699c6e2377195b47c11768336e6d1f5ba6f530af7546237b839d88dd0cdd2252ad055483aa9f48457a02753da1e3476767"

RPROVIDES:${PN} += "rtla-rebuild rtla-rebuild(aarch-64)"
RDEPENDS:${PN} += "kernel-source"

inherit rpm
