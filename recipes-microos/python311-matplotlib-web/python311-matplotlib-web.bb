SUMMARY = "Web backend for python311-matplotlib"
DESCRIPTION = "This package includes the browser-based webagg backend \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-web-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "c2c9e64f524b313922bf82af73e3a390be93d7f5ce713e73871afe10d0d034ed62f901d50f9ff779da20034a4438be88d6931cb5701c4c8dddf87187c97818a0"

RPROVIDES:${PN} += "python311-matplotlib-web python311-matplotlib-web(aarch-64)"
RDEPENDS:${PN} += "python(abi) python311-matplotlib python311-tornado"

inherit rpm
